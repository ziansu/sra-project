@java.lang.Override
protected void onClose() {
    if ((randomUpdate) != null) {
        randomUpdate.cancel();
        randomUpdate = null;
    }
}