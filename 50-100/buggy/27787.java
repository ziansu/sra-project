public synchronized void registerOnError(final som.interpreter.actors.EventualMessage.PromiseMessage msg, final som.interpreter.actors.Actor current) {
    if ((resolutionState) == (som.interpreter.actors.SPromise.Resolution.ERRORNOUS)) {
        scheduleCallbacksOnResolution(value, msg, current, false);
    }else {
        if ((resolutionState) == (som.interpreter.actors.SPromise.Resolution.SUCCESSFUL)) {
            return ;
        }
        if ((onError) == null) {
            onError = new java.util.ArrayList<>(1);
        }
        onError.add(msg);
    }
}