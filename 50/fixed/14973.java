private void updateNextWaveReady() {
    if (mNextWaveReady) {
        return ;
    }
    if (!(mMinWaveDelayTimeout)) {
        return ;
    }
    if ((mActiveWaves.size()) >= (ch.logixisland.anuto.business.game.WaveManager.MAX_WAVES_IN_GAME)) {
        return ;
    }
    setNextWaveReady(true);
}