@java.lang.Override
protected synchronized void play(bms.player.beatoraja.audio.PCM id, float volume, boolean loop) {
    mixer.put(id, volume, loop);
}