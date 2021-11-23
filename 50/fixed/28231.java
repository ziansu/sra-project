public void loadSoundSample(repository.SoundSample soundSample) {
    sounds.put(soundSample, loadSoundSamplePlayer(soundSample));
}