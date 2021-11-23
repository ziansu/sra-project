@java.lang.Override
public void skipToKeyframeBefore(long timeUs) {
    primarySampleQueue.skipToKeyframeBefore(timeUs, true);
}