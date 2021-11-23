private com.starproductions.starmotion.starmotion.ScoreSystem.Score getMinScore(java.util.ArrayList<com.starproductions.starmotion.starmotion.ScoreSystem.Score> scoreList) {
    com.starproductions.starmotion.starmotion.ScoreSystem.Score min = null;
    for (com.starproductions.starmotion.starmotion.ScoreSystem.Score score : scoreList)
        if (min == null)
            min = score;
        else
            min = ((min.getScore()) < (score.getScore())) ? min : score;
        
    
    return min;
}