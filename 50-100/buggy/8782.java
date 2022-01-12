private void resetBall(int scorer) {
    if (scorer == 10) {
        (score2)++;
    }else {
        (score1)++;
    }
    ballIsStopped = true;
    ballOffsetX = 0;
    ballOffsetY = 0;
    ballVelX = 0;
    ballVelY = 0;
    bat1Offset = 0;
    bat2Offset = 0;
    lastScorer = scorer;
    bounces = 0;
}