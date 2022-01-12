public void playMusic(java.lang.String musicName) {
    com.badlogic.gdx.audio.Music music = loadedMusic.get(musicName);
    if (music == null) {
        music = gameControl.getGameAssetManager().get(musicName, com.badlogic.gdx.audio.Music.class);
        loadedMusic.put(musicName, music);
    }
    music.setVolume((musicMute ? 0.0F : musicVolume));
    music.play();
    music.setLooping(true);
}