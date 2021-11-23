@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((mp) != null) {
        mp.release();
    }
    doUnbindService();
}