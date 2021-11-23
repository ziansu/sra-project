@java.lang.Override
public void onDestroy() {
    com.antest1.kcanotify.KcaQuestViewService.active = false;
    if ((mView) != null) {
        mView.setVisibility(View.GONE);
        if ((mView.getParent()) != null)
            mManager.removeView(mView);
        
    }
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(refreshreceiver);
    mView = null;
    mManager = null;
    super.onDestroy();
}