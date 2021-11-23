public void playMusic(com.gdxgame.core.enums.MusicType type) {
    currentMusicType = type;
    SoundManager.INSTANCE.playMusic(currentMusicType, true);
}