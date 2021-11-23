@java.lang.Override
protected synchronized long play(bms.player.beatoraja.audio.PCM id, float volume, boolean loop) {
    return mixer.put(id, loop);
}