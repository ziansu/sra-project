public void run() {
    while (isPlaying) {
        playTone(toneFreqInHz, net.mabboud.hair_o_matic.TonePlayer.TONE_PAUSE_TIME);
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}