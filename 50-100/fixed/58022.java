public com.codepath.collabdj.sound.SamplePlayer.SampleHandle newSample(java.lang.String path, long duration) {
    java.lang.Integer sampleId = loadedSounds.get(path);
    if (sampleId == null) {
        sampleId = soundPool.load(path, 1);
        loadedSounds.put(path, sampleId);
    }
    return newHandle(sampleId, duration);
}