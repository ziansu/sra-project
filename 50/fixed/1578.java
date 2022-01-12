@java.lang.Override
public java.lang.Void get() {
    store.setStop(programRunId.getParent(), programRunId.getRun(), java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(endTime), programRunStatus, cause);
    return null;
}