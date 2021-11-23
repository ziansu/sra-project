public void sequencePlay() throws java.lang.InterruptedException {
    streamId = sp.play(dtmf_tone, volume, volume, 1, 0, 1.0F);
    timeUp = false;
    playing = true;
    java.lang.Thread.sleep(minTime);
    stopNow();
    java.lang.Thread.sleep(silenceTime);
}