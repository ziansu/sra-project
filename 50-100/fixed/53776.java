private void insertScoreAtIndex(int score, int insertIndex) {
    int scoreIndex = (scoreTimes.length) - 1;
    while ((scoreIndex >= insertIndex) && (scoreIndex > 0)) {
        scoreTimes[scoreIndex] = scoreTimes[(scoreIndex - 1)];
        scoreNames[scoreIndex] = scoreNames[(scoreIndex - 1)];
        scoreIndex--;
    } 
    scoreTimes[insertIndex] = score;
    scoreNames[insertIndex] = "_";
}