protected void onStop() {
    super.onStop();
    android.util.Log.e("Tracking", "onStop");
    handler.removeCallbacks(thread);
    if ((doAsynchronousTask) != null)
        doAsynchronousTask.cancel();
    
}