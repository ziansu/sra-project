@java.lang.Override
public void artistInfoSucess(com.naman14.timber.lastfmapi.models.LastfmArtist artist) {
    if ((artist != null) && ((itemHolder.artistImage) != null)) {
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(artist.mArtwork.get(1).mUrl, itemHolder.artistImage, new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).showImageOnFail(R.drawable.ic_empty_music2).resetViewBeforeLoading(true).displayer(new com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer(400)).build());
    }
}