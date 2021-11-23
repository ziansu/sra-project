@java.lang.Override
protected void interruptTask() {
    cancelled = true;
    if ((latch.getCount()) == 1) {
        latch.countDown();
        output = null;
    }
}