public int getTotalScore() {
    int tempSum = 0;
    for (int i = 0; i < 6; i++) {
        tempSum = results[i];
    }
    if (tempSum >= (yahtzee.ScoreCard.BONUSLIMIT))
        sum += yahtzee.ScoreCard.BONUSLIMIT;
    
    return sum;
}