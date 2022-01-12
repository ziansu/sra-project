public void updateButtons(android.graphics.Bitmap leftBitmap, android.graphics.Bitmap rightBitmap) {
    setLeftBitmap(leftBitmap);
    setRightBitmap(rightBitmap);
    if (leftBitmap != null) {
        leftImgBtn.setImageBitmap(leftBitmap);
        leftImgBtn.setClickable(true);
    }else {
        leftImgBtn.setClickable(false);
    }
    if (rightBitmap != null) {
        rightImgBtn.setImageBitmap(rightBitmap);
        rightImgBtn.setClickable(true);
    }else {
        rightImgBtn.setClickable(false);
    }
}