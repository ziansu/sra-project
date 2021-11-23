public long levelWon(int winLevel) {
    long customWinTime = 1000 * (winLevel + 3);
    if (customWinTime > 10000) {
        customWinTime = 10000;
    }
    long timeLeft = (com.Norvan.LockPick.TimeTrialMode.TimingHandler.startTime) - ((getCurrentTime()) - (chronoTimer.getBase()));
    long levelTime = (levelStartTimeLeft) - timeLeft;
    levelStartTimeLeft = timeLeft;
    pauseTimer();
    pauseChronoElapsed = (pauseChronoElapsed) - customWinTime;
    return levelTime;
}