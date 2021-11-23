private void drawChecked(android.graphics.Canvas canvas) {
    android.graphics.Paint paint = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.ic_check);
    if (bitmap != null) {
        float posX = ((canvas.getWidth()) - (bitmap.getWidth())) / 2;
        float posY = ((canvas.getHeight()) - (bitmap.getHeight())) / 2;
        canvas.drawBitmap(bitmap, posX, posY, paint);
    }
}