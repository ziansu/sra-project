private void killAuto() {
    if ((autoFuture) != null) {
        autoFuture.cancel(true);
    }
}