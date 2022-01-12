public void handle(float deltaTime) {
    if ((currentMusicState) == (at.juggle.gdx.SoundManager.MusicState.FadeOut)) {
        float fadeTime = 3.0F;
        float step = (maxVolume) / fadeTime;
        currentVolume -= deltaTime * step;
        if ((currentVolume) <= 0) {
            currentMusicState = at.juggle.gdx.SoundManager.MusicState.Running;
            currentMusic.stop();
            currentMusic = null;
            currentVolume = maxVolume;
            nextMusic = null;
        }else {
            currentMusic.setVolume(currentVolume);
        }
    }
}