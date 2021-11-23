@java.lang.Override
public void skipToKeyframeBefore(long timeUs) {
    sampleQueues.valueAt(track).skipToKeyframeBefore(timeUs);
}