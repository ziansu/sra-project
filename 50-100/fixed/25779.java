public void resolveLevelLoss() {
    (lives)--;
    java.lang.System.out.println(("LIVES: " + (lives)));
    if ((lives) >= 0) {
        controller = controllers.get(this.LEVEL_LOSS);
    }else {
        controller = controllers.get(this.GAME_OVER);
    }
    controller.initialize();
}