public heronarts.lx.audio.LXAudioOutput setAudioInputStream(javax.sound.sampled.AudioInputStream inputStream) {
    this.inputStream = inputStream;
    open();
    return this;
}