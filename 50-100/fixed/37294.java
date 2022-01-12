@java.lang.Override
public void onComplete() {
    bufferLock.lock();
    try {
        if (terminated)
            return ;
        
        if (buffer.isEmpty()) {
            terminated = true;
            subscriber.onComplete();
        }
        buffer.complete();
    } finally {
        bufferLock.unlock();
    }
}