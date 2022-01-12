@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((receiver) != null) {
        toBeRerigestered = true;
        unregisterReceiver(receiver);
    }
}