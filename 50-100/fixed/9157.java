private double getReward(ab.vision.GameStateExtractor.GameState state) {
    java.lang.System.out.println(state);
    if (state == (ab.vision.GameStateExtractor.GameState.WON)) {
        ab.vision.GameStateExtractor gameStateExtractor = new ab.vision.GameStateExtractor();
        java.lang.System.out.println(state);
        java.awt.image.BufferedImage scoreScreenshot = clientActionRobotJava.doScreenShot();
        java.lang.System.out.println(state);
        double reward = gameStateExtractor.getScoreEndGame(scoreScreenshot);
        java.lang.System.out.println(reward);
        return reward;
    }else {
        return 0;
    }
}