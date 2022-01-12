private void setVolume(float volume) {
    this.volume = volume;
    alSourcef(srcNames, io.github.subiyacryolite.enginev1.AL_GAIN, (volume / 100.0F));
}