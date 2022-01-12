private boolean attachAudioToSource(int sourceId, com.jme3.audio.openal.AudioData data, boolean looping) {
    if (data instanceof com.jme3.audio.openal.AudioBuffer) {
        return attachBufferToSource(sourceId, ((com.jme3.audio.openal.AudioBuffer) (data)));
    }else
        if (data instanceof com.jme3.audio.openal.AudioStream) {
            return attachStreamToSource(sourceId, ((com.jme3.audio.openal.AudioStream) (data)), looping);
        }
    
    throw new java.lang.UnsupportedOperationException();
}