public void run() {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.connection_failed), Toast.LENGTH_LONG).show();
    mDevice = null;
    mService = null;
    mIDevice = null;
}