protected void waitForPromiseSuccess() throws java.io.IOException, java.util.concurrent.TimeoutException {
    while ((!(promise.isDone())) && (!(promise.isCancelled()))) {
        io.netty.util.concurrent.Promise<T> listeningPromise = this.promise;
        listeningPromise.awaitUninterruptibly();
        if (listeningPromise == (this.promise)) {
            this.handlePromise(promise);
            break;
        }
    } 
}