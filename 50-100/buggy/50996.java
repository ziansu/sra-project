public void registerClient(com.wojtechnology.sunami.MainActivity activity) {
    mContext = activity;
    if (!(mIsInit)) {
        init();
    }
    mBound = true;
    mContext.setVolumeControlStream(AudioManager.STREAM_MUSIC);
    mContext.setProgressBar(false);
    mContext.setRecyclerViewData();
}