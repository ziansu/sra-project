public void setThumbnailBitmap(android.graphics.Bitmap bm, java.lang.String thumbPath) {
    photos_iv.setEnabled(true);
    if (bm == null) {
        return ;
    }
    android.graphics.Bitmap thumbnail = android.media.ThumbnailUtils.extractThumbnail(bm, 213, 213);
    btn_thumbnail.setImageBitmap(thumbnail);
    this.thumbPath = thumbPath;
    btn_thumbnail.setVisibility(View.VISIBLE);
}