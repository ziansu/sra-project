public static void main(java.lang.String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;
    int highScore = com.company.Main.calculateScore(true, 800, 5, 100);
    java.lang.System.out.println(("Your final score was " + highScore));
    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    highScore = com.company.Main.calculateScore(gameOver, score, levelCompleted, bonus);
    java.lang.System.out.println(("Your final score was " + highScore));
}