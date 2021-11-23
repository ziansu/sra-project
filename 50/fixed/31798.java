public java.lang.String loadAvatarThumbnail(org.matrix.androidsdk.HomeserverConnectionConfig hsConfig, android.widget.ImageView imageView, java.lang.String url, int side) {
    return loadBitmap(imageView.getContext(), hsConfig, imageView, url, side, side, 0, ExifInterface.ORIENTATION_UNDEFINED, null, getThumbnailsFolderFile(), null);
}