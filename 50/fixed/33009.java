@java.lang.Override
protected void onResume() {
    super.onResume();
    MbtaBusTrackerApplication.bus.register(this);
    timer = new java.util.Timer();
    scheduleBusLocationUpdate();
}