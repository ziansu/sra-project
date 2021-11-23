@java.lang.Override
public boolean expire() {
    if (!(super.expire())) {
        return false;
    }
    eventDispatcher.shutdown();
    return true;
}