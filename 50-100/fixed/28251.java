protected com.codepath.collabdj.sound.SamplePlayer.SampleHandle newHandle(int sampleId, long duration) {
    java.util.List<com.codepath.collabdj.sound.SamplePlayer.SampleHandle> sampleHandlesList = sampleHandles.get(sampleId);
    boolean isLoaded = false;
    if (sampleHandlesList == null) {
        sampleHandlesList = new java.util.ArrayList<>(1);
        sampleHandles.put(sampleId, sampleHandlesList);
    }else {
        isLoaded = sampleHandlesList.get(0).isLoaded;
    }
    com.codepath.collabdj.sound.SamplePlayer.SampleHandle sampleHandle = new com.codepath.collabdj.sound.SamplePlayer.SampleHandle(sampleId, isLoaded, duration);
    sampleHandlesList.add(sampleHandle);
    return sampleHandle;
}