@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        player.stop();
        player.release();
    } catch (java.lang.Exception e) {
    }
}