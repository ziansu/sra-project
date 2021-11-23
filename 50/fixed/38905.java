@java.lang.Override
public void onHostPause() {
    if (hasPermissions()) {
        map.setMyLocationEnabled(false);
    }
    paused = true;
}