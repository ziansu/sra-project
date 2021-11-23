@java.lang.Override
public void onResourceUnavailable() {
    setLocationEnabled(false);
    setLocation(null);
}