@java.lang.Override
public void onComplete() {
    if (done) {
        return ;
    }
    R col = collection;
    if (col != null) {
        collection = null;
        if (emitRemainder) {
            queue.offer(col);
        }
    }
    done = true;
    drain();
}