private synchronized void registerOnError(final som.interpreter.actors.EventualMessage.PromiseMessage msg) {
    if (errored) {
        scheduleCallbacksOnResolution(value, msg);
    }else {
        if (resolved) {
            return ;
        }
        if ((onError) == null) {
            onError = new java.util.ArrayList<>(1);
        }
        onError.add(msg);
    }
}