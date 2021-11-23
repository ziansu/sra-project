@java.lang.Override
protected void onPause() {
    if ((receiver) != null) {
        toBeRerigestered = true;
        unregisterReceiver(receiver);
    }
}