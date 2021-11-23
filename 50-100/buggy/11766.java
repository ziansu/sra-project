@java.lang.Override
public void onComplete() {
    if (done) {
        return ;
    }
    done = true;
    R col = collection;
    if (col != null) {
        collection = null;
        if (emitRemainder) {
            queue.offer(col);
        }
    }
    drain();
}