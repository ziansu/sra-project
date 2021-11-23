public void playBanner() {
    if ((((mHandler) != null) && (!(isPlaying))) && ((mBannerAdapter.getItemCount()) > 1)) {
        isPlaying = true;
        mHandler.removeCallbacksAndMessages(null);
        mHandler.postDelayed(mBannerTask, mInterval);
    }
}