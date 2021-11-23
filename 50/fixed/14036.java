public com.builtbroken.mc.client.json.audio.AudioData getAudio(java.lang.String key) {
    if ((key == null) || (key.isEmpty())) {
        return null;
    }
    return audioData.get(key.toLowerCase());
}