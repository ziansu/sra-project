@java.lang.Override
public void onComplete() {
    bufferLock.lock();
    if (terminated) {
        return ;
    }
    try {
        if (buffer.isEmpty()) {
            subscriber.onComplete();
        }
        buffer.complete();
        terminated = true;
    } finally {
        bufferLock.unlock();
    }
}