public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        java.lang.System.out.println(("Your final score was " + finalScore));
        return finalScore;
    }else {
        return -1;
    }
}