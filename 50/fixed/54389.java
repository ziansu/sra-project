@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        doUnbindService();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    si.formias.gentian.GentianChat.running = false;
}