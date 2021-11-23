@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    if (!(done)) {
        synchronized(mutex) {
            if (!(done)) {
                error = t;
                done = true;
            }
        }
    }
    callback.onFailure(t);
}