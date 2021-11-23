public void leaveThread() {
    com.oracle.truffle.api.CompilerAsserts.neverPartOfCompilation();
    phaser.arriveAndDeregister();
    runningThreads.remove(new org.jruby.truffle.runtime.subsystems.SafepointManager.RunningThread(java.lang.Thread.currentThread(), false));
}