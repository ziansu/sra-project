@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    com.owncloud.android.lib.common.utils.Log_OC.v(com.owncloud.android.ui.activity.FileDisplayActivity.TAG, "onSaveInstanceState() start");
    super.onSaveInstanceState(outState);
    outState.putParcelable(com.owncloud.android.ui.activity.FileDisplayActivity.KEY_WAITING_TO_PREVIEW, mWaitingToPreview);
    outState.putBoolean(com.owncloud.android.ui.activity.FileDisplayActivity.KEY_SYNC_IN_PROGRESS, mSyncInProgress);
    outState.putParcelable(com.owncloud.android.ui.activity.FileDisplayActivity.KEY_WAITING_TO_SEND, mWaitingToSend);
    outState.putBoolean(com.owncloud.android.ui.activity.FileDisplayActivity.KEY_IS_SEARCH_OPEN, (!(mSearchView.isIconified())));
    outState.putString(com.owncloud.android.ui.activity.FileDisplayActivity.KEY_SEARCH_QUERY, mSearchQuery);
    com.owncloud.android.lib.common.utils.Log_OC.v(com.owncloud.android.ui.activity.FileDisplayActivity.TAG, "onSaveInstanceState() end");
}