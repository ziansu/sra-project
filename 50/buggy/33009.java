@java.lang.Override
protected void onResume() {
    super.onResume();
    MbtaBusTrackerApplication.bus.register(this);
    if ((timer) == null) {
        timer = new java.util.Timer();
    }
    scheduleBusLocationUpdate();
}