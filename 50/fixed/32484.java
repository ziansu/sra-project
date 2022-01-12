public void onServiceDisconnected(android.content.ComponentName name) {
    synchronized(this) {
        mServiceInterface = null;
    }
}