private void setPhoto(java.lang.String path) {
    if (path != null) {
        int w = 150;
        android.graphics.Bitmap full = ca.dal.csci4176.journalit.utils.BitmapUtils.decodeSubsampledBitmap(path, w, w);
        if (full != null) {
            android.graphics.Bitmap thumb = android.media.ThumbnailUtils.extractThumbnail(full, w, w);
            picture.setImageBitmap(thumb);
            picture.setVisibility(View.VISIBLE);
            return ;
        }
    }
    picture.setImageResource(R.mipmap.ic_launcher);
}