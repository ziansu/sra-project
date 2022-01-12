public static void playSFXSounds() {
    com.game.Audio.Sounds.sound.setLooping(0, true);
    com.game.Audio.Sounds.sound.setVolume(com.game.Audio.Sounds.Game_SFX_Sound, com.game.Audio.Sounds.Game_SFX_Volume);
    com.game.Audio.Sounds.sound.play(com.game.Audio.Sounds.Game_SFX_Volume);
}