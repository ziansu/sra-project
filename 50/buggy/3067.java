public void onError(java.lang.Throwable t) {
    if ((done) || (cancelled)) {
        return ;
    }
    error = t;
    done = true;
    doTerminate();
    drain();
}