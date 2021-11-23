@java.lang.Override
public void run() {
    closeOutputListener();
    org.netbeans.modules.nativeexecution.api.NativeProcess process = processRef.get();
    try {
        if ((process != null) && ((listener) != null)) {
            listener.executionFinished(process.exitValue());
        }
    } finally {
        if ((syncWorker) != null) {
            syncWorker.shutdown();
        }
    }
}