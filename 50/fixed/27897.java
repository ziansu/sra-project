public void registerNewWave() {
    for (cooldown.WavesCDHandler.TimeHelper TH : THs) {
        if (TH.removeRound()) {
            TH.getWavesCooldown().afterCD();
        }
    }
}