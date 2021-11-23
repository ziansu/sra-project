@java.lang.Override
protected <A> void sendInternal(io.techery.janet.ActionHolder<A> holder) throws io.techery.janet.JanetException {
    if (onInterceptSend(holder))
        callback.onSuccess(holder);
    else
        try {
            actionService.sendInternal(holder);
        } catch (io.techery.janet.JanetException e) {
            this.callback.onFail(holder, e);
            throw e;
        }
    
}