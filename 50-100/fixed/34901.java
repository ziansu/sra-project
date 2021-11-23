@java.lang.Override
public java.lang.Void call(java.lang.Boolean success) {
    if (success) {
        if ((succeded.compareAndSet(false, true)) && (!(failed.get()))) {
            listener.onSuccess("Done.");
        }
    }else {
        if (failed.compareAndSet(false, true)) {
            listener.onError("Failed.");
        }
    }
    return null;
}