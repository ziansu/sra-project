public void onError(java.lang.Throwable t) {
    error = t;
    done = true;
    doTerminate();
    drain();
}