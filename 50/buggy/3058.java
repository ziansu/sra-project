@java.lang.Override
public void onApiConnected() {
    super.onApiConnected();
    adapter.addAll(com.o3dr.services.android.lib.gcs.follow.FollowType.values());
    getBroadcastManager().registerReceiver(eventReceiver, org.droidplanner.android.fragments.mode.ModeFollowFragment.eventFilter);
}