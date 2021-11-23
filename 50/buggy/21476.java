protected void onCompleted() {
    onRxCompleted();
    unsubscribe();
}