@java.lang.Override
public void run() {
    closeOutputListener();
    org.netbeans.modules.nativeexecution.api.NativeProcess process = processRef.get();
    if ((syncWorker) != null) {
        syncWorker.shutdown();
    }
    if ((process != null) && ((listener) != null)) {
        listener.executionFinished(process.exitValue());
    }
}