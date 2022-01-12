@java.lang.Override
public void run() {
    closeOutputListener();
    org.netbeans.modules.nativeexecution.api.NativeProcess process = processRef.get();
    try {
        if ((syncWorker) != null) {
            syncWorker.shutdown();
        }
    } finally {
        if ((process != null) && ((listener) != null)) {
            listener.executionFinished(process.exitValue());
        }
    }
}