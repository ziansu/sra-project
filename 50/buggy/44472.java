@java.lang.Override
protected void uninstallOnChildThread() {
    com.palantir.common.concurrent.ExecutorInheritableThreadLocalTest.outputList.add(((get()) + 1));
}