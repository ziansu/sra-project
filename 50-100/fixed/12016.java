public static android.graphics.Bitmap resizeImage(android.graphics.Bitmap unscaledBitmap, int desiredWidth, int desiredHeight) throws java.io.IOException {
    try {
        if (!(((unscaledBitmap.getWidth()) <= desiredWidth) && ((unscaledBitmap.getHeight()) <= desiredHeight))) {
            android.graphics.Bitmap scaledBitmap = com.scanlibrary.ScalingUtilities.createScaledBitmap(unscaledBitmap, desiredWidth, desiredHeight, ScalingLogic.FIT);
            return scaledBitmap;
        }else {
            return unscaledBitmap;
        }
    } catch (java.lang.Throwable e) {
        throw new java.io.IOException(e);
    }
}