@org.greenrobot.eventbus.Subscribe
public void onEvent(org.openbmap.events.onServiceShutdown event) {
    if ((event.reason) == (org.openbmap.RadioBeacon.SHUTDOWN_REASON_LOW_POWER)) {
        android.widget.Toast.makeText(this, getString(R.string.battery_warning), Toast.LENGTH_LONG).show();
    }
    stopManagerService();
    this.finish();
}