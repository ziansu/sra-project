public void updateButtons(android.graphics.Bitmap leftBitmap, android.graphics.Bitmap rightBitmap) {
    setLeftBitmap(leftBitmap);
    setRightBitmap(rightBitmap);
    if (leftBitmap != null) {
        leftImgBtn.setImageBitmap(leftBitmap);
        leftImgBtn.setEnabled(true);
    }else {
        leftImgBtn.setEnabled(false);
    }
    if (rightBitmap != null) {
        rightImgBtn.setImageBitmap(rightBitmap);
        rightImgBtn.setEnabled(true);
    }else {
        rightImgBtn.setEnabled(false);
    }
}