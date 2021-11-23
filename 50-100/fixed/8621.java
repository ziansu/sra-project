public void startServing() {
    try {
        de.volzo.miscreen.Host.getInstance().serve(((nsd.hostPort) + 1));
    } catch (java.lang.Exception e) {
        android.util.Log.e(de.volzo.miscreen.MainActivity.TAG, "serving failed");
        android.util.Log.e(de.volzo.miscreen.MainActivity.TAG, e.toString());
    }
}