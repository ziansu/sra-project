@java.lang.Override
protected void onPause() {
    super.onPause();
    handler.removeCallbacks(zoomChecker);
    visible = false;
    android.util.Log.d(org.unchiujar.umbra.FogOfExplore.TAG, "onPause completed.");
}