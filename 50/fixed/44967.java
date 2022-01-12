private void resolveWin() {
    mSoundPool.play(mWinSound, 1, 1, 0, 0, 1);
    mWon = true;
    mEnemyEntities.clear();
}