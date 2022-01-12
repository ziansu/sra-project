@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mServiceConnection) != null)
        unbindService(mServiceConnection);
    
}