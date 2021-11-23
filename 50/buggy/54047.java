public void onServiceDisconnected(android.content.ComponentName className) {
    android.util.Log.e(edu.grinnell.kdic.MainActivity.TAG, "onServiceDisconnected");
    boundToRadioService = false;
}