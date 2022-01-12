private void attachAudioToSource(int sourceId, com.jme3.audio.openal.AudioData data, boolean looping) {
    if (data instanceof com.jme3.audio.openal.AudioBuffer) {
        attachBufferToSource(sourceId, ((com.jme3.audio.openal.AudioBuffer) (data)));
    }else
        if (data instanceof com.jme3.audio.openal.AudioStream) {
            attachStreamToSource(sourceId, ((com.jme3.audio.openal.AudioStream) (data)), looping);
        }else {
            throw new java.lang.UnsupportedOperationException();
        }
    
}