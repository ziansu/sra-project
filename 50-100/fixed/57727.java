@java.lang.SuppressWarnings(value = { "unchecked" })
protected <R> void doDispatch(org.axonframework.commandhandling.CommandMessage<?> command, org.axonframework.commandhandling.CommandCallback<R> callback) {
    try {
        org.axonframework.commandhandling.CommandHandler handler = findCommandHandlerFor(command);
        java.lang.Object result = doDispatch(command, handler);
        callback.onSuccess(((R) (result)));
    } catch (java.lang.Throwable throwable) {
        callback.onFailure(throwable);
    }
}