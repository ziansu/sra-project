@java.lang.Override
public void artistInfoSucess(com.naman14.timber.lastfmapi.models.LastfmArtist artist) {
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(artist.mArtwork.get(4).mUrl, artistArt, new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).showImageOnFail(R.drawable.ic_empty_music2).resetViewBeforeLoading(true).build(), new com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener() {
        @java.lang.Override
        public void onLoadingComplete(java.lang.String imageUri, android.view.View view, android.graphics.Bitmap loadedImage) {
        }
    });
}