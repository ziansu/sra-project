public void stopMovement() {
    if ((timer) != null) {
        timer.cancel();
        timer = null;
    }
}