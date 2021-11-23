protected com.codepath.collabdj.sound.SamplePlayer.SampleHandle newHandle(int sampleId, boolean isLoaded, long duration) {
    com.codepath.collabdj.sound.SamplePlayer.SampleHandle sampleHandle = new com.codepath.collabdj.sound.SamplePlayer.SampleHandle(sampleId, isLoaded, duration);
    java.util.List<com.codepath.collabdj.sound.SamplePlayer.SampleHandle> sampleHandlesList = sampleHandles.get(sampleId);
    if (sampleHandlesList == null) {
        sampleHandlesList = new java.util.ArrayList<>(1);
        sampleHandles.put(sampleId, sampleHandlesList);
    }
    sampleHandlesList.add(sampleHandle);
    return sampleHandle;
}