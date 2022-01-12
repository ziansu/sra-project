public int getHighScore() {
    if (impossible) {
        com.bombapps.ColorMatch.ScoreDataSource.createEndlessScore(game.getScore());
        return com.bombapps.ColorMatch.ScoreDataSource.getEndlessHighScore();
    }else
        if (stroopMode) {
            com.bombapps.ColorMatch.ScoreDataSource.createStroopScore(game.getScore());
            return com.bombapps.ColorMatch.ScoreDataSource.getStroopHighScore();
        }else {
            com.bombapps.ColorMatch.ScoreDataSource.createNormalScore(game.getScore());
            return com.bombapps.ColorMatch.ScoreDataSource.getNormalHighScore();
        }
    
}