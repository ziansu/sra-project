public float getLastSample() {
    int lastPos = (currentPosition) - 1;
    if (lastPos < 0) {
        lastPos = (samples.length) - 1;
    }
    return samples[lastPos];
}