@java.lang.Override
public boolean onClose() {
    setFooterEnabled(true);
    mSearchIsOpen = false;
    mSearchQuery = null;
    mRefreshListLayout.setEnabled(true);
    mHandler.removeCallbacksAndMessages(null);
    mHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setFabEnabled(true);
        }
    }, 250);
    refreshDirectory();
    return false;
}