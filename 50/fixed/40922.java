private void onSwipeDown() {
    if ((!(isGoingUp)) && (!(isGoingDown))) {
        isGoingRight = false;
        isGoingLeft = false;
        isGoingDown = true;
        isGoingUp = false;
    }
}