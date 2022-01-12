private void initView() {
    mMediaController = ((bf.cloud.BFMediaPlayerControllerVod) (findViewById(R.id.vod_media_controller_vod)));
    mVodPlayer = ((bf.cloud.android.playutils.VodPlayer) (mMediaController.getPlayer()));
    mVodPlayer.setDataSource(mUrls[mVideoIndex]);
}