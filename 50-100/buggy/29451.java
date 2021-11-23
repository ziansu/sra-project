public com.linguaculturalists.phoenicia.models.GameTileTimer getTimer() {
    com.linguaculturalists.phoenicia.models.GameTileTimer timer = this.timer.get(PhoeniciaContext.context);
    if (timer == null) {
        timer = new com.linguaculturalists.phoenicia.models.GameTileTimer();
        timer.game.set(this.phoeniciaGame.session);
        timer.progress.set(0);
        timer.status.set(Builder.NONE);
        this.phoeniciaGame.addBuilder(timer);
        this.setTimer(timer);
    }
    timer.time.set(this.game.time);
    timer.save(PhoeniciaContext.context);
    return timer;
}