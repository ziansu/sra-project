@java.lang.Override
public void run() {
    if (mInRecordingcycle) {
        doRecordLoop(lengthToRecord, intervalToRecord, (numberOfRecordings - 1));
    }
}