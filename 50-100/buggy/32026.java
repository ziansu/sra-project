public void playBanner() {
    if ((((mHandler) != null) && (!(isPlaying))) && ((mBannerAdapter.getItemCount()) > 1)) {
        mHandler.removeCallbacksAndMessages(null);
        mHandler.postDelayed(mBannerTask, mInterval);
        isPlaying = true;
    }
}