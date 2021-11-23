public som.interpreter.actors.SPromise whenResolvedOrError(final som.vmobjects.SBlock resolved, final som.vmobjects.SBlock error) {
    assert (resolved.getMethod().getNumberOfArguments()) == 2;
    assert (error.getMethod().getNumberOfArguments()) == 2;
    som.interpreter.actors.SPromise promise = new som.interpreter.actors.SPromise(som.interpreter.actors.EventualMessage.getActorCurrentMessageIsExecutionOn());
    som.interpreter.actors.SPromise.SResolver resolver = new som.interpreter.actors.SPromise.SResolver(promise);
    synchronized(this) {
        registerWhenResolved(resolved, resolver);
        registerOnError(error, resolver);
    }
    return promise;
}