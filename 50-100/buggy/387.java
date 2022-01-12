@java.lang.Override
protected void onResume() {
    com.michaelchen.chairtalk.MainActivity.currActivity = this;
    super.onResume();
    android.content.Intent i = getIntent();
    if ((i != null) && (i.getBooleanExtra(com.michaelchen.chairtalk.MainActivity.SKIP_BL, false))) {
    }else
        if (((bluetoothManager) == null) || (!(bluetoothManager.isConnected()))) {
            initBle();
            return ;
        }
    
    rescheduleBLTimer(0);
}