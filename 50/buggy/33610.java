@java.lang.Override
protected boolean onCancel() {
    if ((resultLatch.getCount()) == 0) {
        return false;
    }
    resultLatch.countDown();
    return true;
}