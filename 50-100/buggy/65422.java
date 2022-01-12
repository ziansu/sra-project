@java.lang.Override
public void onSuccess(gobblin.writer.WriteResponse writeResponse) {
    synchronized(this) {
        _writeResponse = writeResponse;
        _callbackFired = true;
        if ((_innerCallback) != null) {
            try {
                _innerCallback.onSuccess(writeResponse);
            } catch (java.lang.Exception e) {
                log.error("Ignoring error thrown in callback", e);
            }
        }
        notifyAll();
    }
}