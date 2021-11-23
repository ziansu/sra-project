public java.lang.String testPlayBall(double r) {
    int count = 0;
    double sum = 0;
    while (count < (Batsman.BALL_RESULT.length)) {
        sum += ((double) (probabilities[count])) / 100;
        if (r < sum)
            break;
        
        count++;
    } 
    currentBallResult = Batsman.BALL_RESULT[count];
    addRuns();
    (ballsPlayed)++;
    return currentBallResult;
}