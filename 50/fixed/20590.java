@java.lang.Override
public void run() {
    if (!(isUserLocationEnabled())) {
        toggleUserLocation(true);
    }
}