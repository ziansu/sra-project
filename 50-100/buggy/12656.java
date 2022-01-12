private void updateTrackersWithWord(int wordNum) {
    long setBit = 1L << (wordNum & 63);
    if ((tracker1[(wordNum >>> 6)] |= setBit) != setBit) {
        tracker2[(wordNum >>> 12)] |= 1L << ((wordNum >>> 6) & 63);
    }
}