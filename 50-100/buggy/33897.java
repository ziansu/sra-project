private com.starproductions.starmotion.starmotion.ScoreSystem.Score getMinScore(java.util.ArrayList<com.starproductions.starmotion.starmotion.ScoreSystem.Score> scoreList) {
    com.starproductions.starmotion.starmotion.ScoreSystem.Score min = scoreList.get(0);
    for (com.starproductions.starmotion.starmotion.ScoreSystem.Score score : scoreList)
        min = ((min.getScore()) < (score.getScore())) ? min : score;
    
    return min;
}