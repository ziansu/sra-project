public android.graphics.Bitmap imageBorderMerge(android.graphics.drawable.Drawable drawable, final android.graphics.Bitmap currentBitmap) {
    imageBorderBitmap = imageBorderToDrawable(drawable);
    try {
        imageBorderOverlay = android.graphics.Bitmap.createBitmap(imageBorderBitmap.getWidth(), imageBorderBitmap.getHeight(), imageBorderBitmap.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(imageBorderOverlay);
        if (currentBitmap != null)
            canvas.drawBitmap(currentBitmap, imageBorderAnchorLeft, imageBorderAnchorTop, null);
        
        canvas.drawBitmap(imageBorderBitmap, new android.graphics.Matrix(), null);
    } catch (java.lang.IllegalArgumentException iae) {
    }
    return imageBorderOverlay;
}