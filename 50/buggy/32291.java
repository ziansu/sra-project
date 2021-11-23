public void onComplete() {
    if ((done) || (cancelled)) {
        return ;
    }
    done = true;
    doTerminate();
    drain();
}