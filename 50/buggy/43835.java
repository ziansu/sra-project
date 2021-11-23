public void resolveLevelWin(int score) {
    total_score += score;
    controller = this.LEVEL_WIN;
    controllers.get(controller).initialize();
}