public float getLastSample() {
    int lastPos = currentPosition;
    if (lastPos < 0) {
        lastPos = (samples.length) - 1;
    }
    return samples[lastPos];
}