@java.lang.Override
public void onResponse(java.lang.Object response) {
    if (!(done)) {
        synchronized(mutex) {
            if (!(done)) {
                value = getResult(response);
                done = true;
            }
        }
    }
    callback.onResponse(((T) (value)));
}