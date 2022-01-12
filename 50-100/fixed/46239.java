@java.lang.Override
public void run() {
    dismissLoadingProgress();
    if ((mAdapter.getCount()) > 0) {
        mAdapter.notifyDataSetChanged();
        mMessageListView.setSelection(((mAdapter.getCount()) - 1));
    }
    android.util.Log.d(org.matrix.androidsdk.fragments.MatrixMessageListFragment.LOG_TAG, "onInitialMessagesLoaded");
    mIsInitialSyncing = false;
    mMessageListView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            fillHistoryPage();
        }
    });
}