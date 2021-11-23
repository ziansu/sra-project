@java.lang.Override
public void onHostPause() {
    if (hasPermissions()) {
        map.setMyLocationEnabled(false);
    }
    synchronized(this) {
        this.onPause();
        paused = true;
    }
}