public int getHighScore() {
    if (stroopMode) {
        com.bombapps.ColorMatch.ScoreDataSource.createStroopScore(game.getScore());
        return com.bombapps.ColorMatch.ScoreDataSource.getStroopHighScore();
    }else
        if (impossible) {
            com.bombapps.ColorMatch.ScoreDataSource.createEndlessScore(game.getScore());
            return com.bombapps.ColorMatch.ScoreDataSource.getEndlessHighScore();
        }else {
            com.bombapps.ColorMatch.ScoreDataSource.createNormalScore(game.getScore());
            return com.bombapps.ColorMatch.ScoreDataSource.getNormalHighScore();
        }
    
}