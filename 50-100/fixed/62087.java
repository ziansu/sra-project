public com.youngcapital.tetris.complete.block.Highscore[] getScores(com.youngcapital.tetris.complete.block.HighscoreRepository hRepo) {
    com.youngcapital.tetris.complete.block.Highscore[] scores = new com.youngcapital.tetris.complete.block.Highscore[((int) (hRepo.count()))];
    int i = 0;
    java.lang.Iterable<com.youngcapital.tetris.complete.block.Highscore> highscores = hRepo.findAll();
    for (com.youngcapital.tetris.complete.block.Highscore score : highscores) {
        scores[i] = score;
        i++;
    }
    java.util.Arrays.sort(scores);
    return scores;
}