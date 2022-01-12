protected java.lang.Void call() throws java.lang.Exception {
    while ((rq.getCount()) != 10) {
        updateProgress(rq.getCount(), rq.numreviewwords());
    } 
    updateProgress(rq.getCount(), rq.numreviewwords());
    if ((rq.getCount()) == (rq.numreviewwords())) {
        rq = null;
    }
    return null;
}