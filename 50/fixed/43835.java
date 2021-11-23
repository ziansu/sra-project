public void resolveLevelWin(int score) {
    total_score += score;
    controller = controllers.get(this.LEVEL_WIN);
    controller.initialize();
}