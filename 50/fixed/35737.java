void skipToKeyframeBefore(int group, long timeUs) {
    sampleQueues.valueAt(group).skipToKeyframeBefore(timeUs, true);
}