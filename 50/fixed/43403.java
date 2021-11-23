public void leaveThread() {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    phaser.arriveAndDeregister();
    runningThreads.remove(java.lang.Thread.currentThread());
}