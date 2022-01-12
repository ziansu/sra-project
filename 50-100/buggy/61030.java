@java.lang.Override
public void onFinished(ch.logixisland.anuto.game.WaveManager m) {
    mActiveWaves.remove(m);
    m.giveReward();
    ageTowers();
    onWaveDone(m.getWave());
    if (!(hasNextWave())) {
        mGameOver = true;
        mGameWon = true;
        onGameOver();
    }
    if ((((getCurrentWaveManager()) == m) && (!(mNextWaveReady))) && (hasNextWave())) {
        onNextWaveReady();
        mNextWaveReady = true;
    }
}