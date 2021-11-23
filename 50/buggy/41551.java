@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        unregisterReceiver(br);
    } catch (java.lang.IllegalArgumentException e) {
        e.printStackTrace();
    }
    java.lang.System.out.println("ondestroy called");
}