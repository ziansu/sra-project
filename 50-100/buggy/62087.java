public com.youngcapital.tetris.complete.block.Highscore[] getScores(com.youngcapital.tetris.complete.block.HighscoreRepository hRepo) {
    int count = ((int) (hRepo.count()));
    com.youngcapital.tetris.complete.block.Highscore[] scores = new com.youngcapital.tetris.complete.block.Highscore[count];
    int i = 0;
    java.lang.Iterable<com.youngcapital.tetris.complete.block.Highscore> highscores = hRepo.findAll();
    for (com.youngcapital.tetris.complete.block.Highscore score : highscores) {
        scores[i] = score;
        i++;
    }
    java.util.Arrays.sort(scores);
    return scores;
}