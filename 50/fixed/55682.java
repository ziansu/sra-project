@java.lang.Override
public void onFailure(java.lang.Throwable t) {
    error = t;
    done = true;
    callback.onFailure(t);
}