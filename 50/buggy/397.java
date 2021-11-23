@java.lang.Override
protected final void onDisable() {
    onStop();
    getContext().unregisterReceiver(receiver);
}