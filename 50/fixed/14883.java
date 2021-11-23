public void setThumbnailImage(android.graphics.Bitmap bm) {
    bmThumb = bm;
    if ((bm != null) && ((imgThumb) != null)) {
        imgThumb.setImageBitmap(bm);
    }
}