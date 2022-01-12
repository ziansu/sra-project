protected boolean waitForPromiseSuccess() throws java.io.IOException, java.util.concurrent.TimeoutException {
    if ((!(promise.isDone())) && (!(promise.isCancelled()))) {
        io.netty.util.concurrent.Promise<T> listeningPromise = this.promise;
        listeningPromise.awaitUninterruptibly();
        if (listeningPromise != (this.promise)) {
            return false;
        }
        this.handlePromise(promise);
    }
    return true;
}