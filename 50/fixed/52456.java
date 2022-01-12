@java.lang.Override
public long getTickPosition() {
    if ((sequencerThread) == null) {
        return 0;
    }
    return sequencerThread.getTickPosition();
}