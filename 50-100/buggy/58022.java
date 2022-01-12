public com.codepath.collabdj.sound.SamplePlayer.SampleHandle newSample(java.lang.String path, long duration) {
    java.lang.Integer sampleId = loadedSounds.get(path);
    boolean isLoaded = sampleId != null;
    if (!isLoaded) {
        sampleId = soundPool.load(path, 1);
    }
    return newHandle(sampleId, isLoaded, duration);
}