@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i(com.firebirdberlin.tinytimetracker.StatsFragment.TAG, "onResume()");
    bus.register(this);
    com.firebirdberlin.tinytimetracker.OnTrackerSelected event = bus.getStickyEvent(com.firebirdberlin.tinytimetracker.OnTrackerSelected.class);
    if (event != null) {
        this.currentTracker = event.newTracker;
    }
    refresh();
}