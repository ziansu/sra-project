public void incrementScore(float score) {
    this.score += score;
    if ((this.score) > (highscore)) {
        Data.HighScore = this.score;
        if ((highscore) > 0)
            gameHigh(true);
        
        counter += 1;
    }else
        counter = 0;
    
    addOffsetY(score);
}