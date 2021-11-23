private synchronized void playSoundFx(int id, boolean isLoop, float volume) {
    if (((soundEffectMap) != null) && (!(soundEffectMap.isEmpty()))) {
        soundPool.play(id, volume, volume, com.huhx0015.hxaudio.audio.HXSoundEngine.SOUND_PRIORITY_LEVEL, (isLoop ? -1 : 0), 1.0F);
    }
}