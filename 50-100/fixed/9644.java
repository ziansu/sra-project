public static void playGameSound() {
    com.badlogic.gdx.files.FileHandle file = Gdx.files.external("gamemusic.mp3");
    if (file.exists()) {
        java.lang.System.out.println("Externes audio.");
        com.game.Audio.Sounds.music = Gdx.audio.newMusic(Gdx.files.external("gamemusic.mp3"));
    }else {
        com.game.Audio.Sounds.music = Gdx.audio.newMusic(Gdx.files.internal("Game_Sound/gamemusic.mp3"));
        com.game.Audio.Sounds.music.play();
        com.game.Audio.Sounds.music.setVolume(com.game.Audio.Sounds.Game_Volume);
    }
}