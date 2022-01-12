public void resolveLevelLoss() {
    (lives)--;
    java.lang.System.out.println(("LIVES: " + (lives)));
    if ((lives) >= 0) {
        controller = this.LEVEL_LOSS;
    }else {
        controller = this.GAME_OVER;
    }
    controllers.get(controller).initialize();
}