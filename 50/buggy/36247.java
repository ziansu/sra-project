public void onLowMemory() {
    android.util.Log.d("CN1 Mapss", "onLowMemory()");
    try {
        if ((view) != null) {
            view.onLowMemory();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}