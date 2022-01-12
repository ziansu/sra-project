public void setCameraPic(android.graphics.Bitmap newBitmap) {
    android.graphics.Bitmap oldBmp = ((android.graphics.drawable.BitmapDrawable) (mImgvPreviewPic.getDrawable())).getBitmap();
    mImgvPreviewPic.setImageBitmap(null);
    com.material.management.utils.Utility.releaseBitmaps(oldBmp);
    oldBmp = null;
    mImgvPreviewPic.setImageBitmap(newBitmap);
}