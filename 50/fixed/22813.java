public void playSoundEffect(int SoundEffect) {
    if ((SoundEffect >= 0) && (SoundEffect < (soundEffectsArr.length))) {
        soundPool.play(soundEffectsArr[SoundEffect], volume, volume, 1, 0, 1);
    }
}