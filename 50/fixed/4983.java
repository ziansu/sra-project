protected synchronized void then(java.lang.Exception exception) {
    this.exception = exception;
    for (com.nthalk.fn.Async.Next<A, ?> next : nexts) {
        next.onParentException(exception);
    }
    nexts.clear();
}