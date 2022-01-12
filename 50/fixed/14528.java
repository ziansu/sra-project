private void onError(java.lang.Throwable e) {
    onRxError(e);
    unsubscribe();
}