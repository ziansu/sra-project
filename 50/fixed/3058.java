@java.lang.Override
public void onApiConnected() {
    super.onApiConnected();
    getBroadcastManager().registerReceiver(eventReceiver, org.droidplanner.android.fragments.mode.ModeFollowFragment.eventFilter);
}