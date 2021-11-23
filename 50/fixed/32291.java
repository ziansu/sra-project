public void onComplete() {
    done = true;
    doTerminate();
    drain();
}