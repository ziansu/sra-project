public void onLowMemory() {
    android.util.Log.i("CN1 Mapss", "onLowMemory()");
    try {
        if ((view) != null) {
            view.onLowMemory();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}