@java.lang.Override
protected void onPause() {
    handler.removeCallbacks(zoomChecker);
    visible = false;
    super.onPause();
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "onPause completed.");
}