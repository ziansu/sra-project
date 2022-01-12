@java.lang.Override
public void onDestroy() {
    context = null;
    geofencingCallbacks = null;
    if ((receiver) != null) {
    }
}