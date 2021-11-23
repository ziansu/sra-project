@java.lang.Override
protected void onPause() {
    if (logging)
        android.util.Log.d("MainActivity", "Start: onPause()");
    
    super.onPause();
    this.onClick(mStopButton);
}