public void setLevelexp(int level, int levelexp) {
    for (int i = 2; i <= level; i++) {
        levelexp = levelexp * 2;
    }
    this.levelexp = levelexp;
}