@java.lang.Override
protected synchronized void play(bms.player.beatoraja.audio.SliceWav<bms.player.beatoraja.audio.PCM> slice, float volume) {
    mixer.stop(((int) (slice.playid)));
    slice.playid = mixer.put(slice.wav, false);
}