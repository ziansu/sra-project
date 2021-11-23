public static void playGameSound() {
    com.game.Audio.Sounds.sound.stop(com.game.Audio.Sounds.Menu_Music);
    com.game.Audio.Sounds.sound = Gdx.audio.newSound(Gdx.files.internal("Game_Sound/Sound.mp3"));
    com.game.Audio.Sounds.sound.setLooping(0, true);
    com.game.Audio.Sounds.Game_Music = com.game.Audio.Sounds.sound.play(0.0F);
    com.game.Audio.Sounds.sound.setLooping(com.game.Audio.Sounds.Game_Music, true);
    com.game.Audio.Sounds.sound.setVolume(com.game.Audio.Sounds.Game_Music, com.game.Audio.Sounds.Game_Volume);
    com.game.Audio.Sounds.sound.play(com.game.Audio.Sounds.Game_Volume);
}