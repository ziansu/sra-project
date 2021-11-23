public com.codepath.collabdj.sound.SamplePlayer.SampleHandle newSample(android.content.Context context, int resId, long duration) {
    java.lang.Integer sampleId = loadedSoundResources.get(resId);
    if (sampleId == null) {
        sampleId = soundPool.load(context, resId, 1);
        loadedSoundResources.put(resId, sampleId);
    }
    return newHandle(sampleId, duration);
}