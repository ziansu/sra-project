public com.codepath.collabdj.sound.SamplePlayer.SampleHandle newSample(android.content.Context context, int resId, long duration) {
    java.lang.Integer sampleId = loadedSoundResources.get(resId);
    boolean isLoaded = sampleId != null;
    if (!isLoaded) {
        sampleId = soundPool.load(context, resId, 1);
    }
    return newHandle(sampleId, isLoaded, duration);
}