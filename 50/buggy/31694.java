@java.lang.Override
public void expire() {
    try {
        eventDispatcher.shutdown();
    } finally {
        super.expire();
    }
}