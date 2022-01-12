@java.lang.Override
public void onResume() {
    super.onResume();
    if (mWasPaused) {
        org.wordpress.android.util.AppLog.d(T.READER, "reader post list > resumed from paused state");
        mWasPaused = false;
        refreshPosts();
        refreshTags();
        if (((!(isUpdating())) && ((getPostListType()) == (org.wordpress.android.ui.reader.ReaderTypes.ReaderPostListType.TAG_FOLLOWED))) && (org.wordpress.android.datasets.ReaderTagTable.shouldAutoUpdateTag(mCurrentTag))) {
            org.wordpress.android.util.AppLog.i(T.READER, "reader post list > auto-updating current tag after resume");
            updatePostsWithTag(getCurrentTag(), RequestDataAction.LOAD_NEWER, RefreshType.AUTOMATIC);
        }
    }
}