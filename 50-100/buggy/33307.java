@java.lang.Override
protected void onStart() {
    super.onStart();
    android.util.Log.d(edu.grinnell.kdic.MainActivity.TAG, "onStart");
    android.content.Intent intent = new android.content.Intent(this, edu.grinnell.kdic.RadioService.class);
    startService(intent);
    bindService(intent, mConnection, edu.grinnell.kdic.BIND_AUTO_CREATE);
    if ((mBackStack.peek()) != (R.id.visualizer))
        updateShowNamePlaybackToolbar();
    
}