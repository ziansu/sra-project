public synchronized void takeChopstick(boolean isLeft) {
    if (isLeft)
        hasLeftChopstick = true;
    else {
        hasRightChopstick = true;
    }
}