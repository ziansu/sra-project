@java.lang.Override
public void onResponse(java.lang.Object response) {
    if ((!(done)) || ((value) == null)) {
        synchronized(mutex) {
            if ((!(done)) || ((value) == null)) {
                value = getResult(response);
                done = true;
            }
        }
    }
    callback.onResponse(((T) (value)));
}