public java.lang.String testPlayBall(double r) {
    int count = 0;
    int sum = 0;
    while (count < (Batsman.BALL_RESULT.length)) {
        sum += probabilities[count];
        if ((r * 100) < sum)
            break;
        
        count++;
    } 
    currentBallResult = Batsman.BALL_RESULT[count];
    addRuns();
    (ballsPlayed)++;
    return currentBallResult;
}