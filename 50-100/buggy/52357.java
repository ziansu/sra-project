@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.content.IntentFilter commentsResultIntentFilter = new android.content.IntentFilter(jqsoft.apps.vkflow.Constants.BROADCAST_ACTION_COMMENTS);
    jqsoft.apps.vkflow.fragments.CommentsFragment.CommentsUpdateReceiver commentsUpdateReceiver = new jqsoft.apps.vkflow.fragments.CommentsFragment.CommentsUpdateReceiver();
    android.support.v4.content.LocalBroadcastManager.getInstance(getContext()).registerReceiver(commentsUpdateReceiver, commentsResultIntentFilter);
    getLoaderManager().initLoader(0, null, this);
    if (savedInstanceState == null) {
        getComments();
    }
}