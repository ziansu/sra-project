private void createTimerLabel() {
    this.timer = new com.badlogic.gdx.scenes.scene2d.ui.Label("Time till game start: ", this.skin);
    this.timer.setPosition(((Gdx.graphics.getWidth()) * (nl.tudelft.ti2806.riverrush.screen.WaitingScreen.TIMER_LABEL_WIDTH_MULTIPLIER)), ((Gdx.graphics.getHeight()) * (nl.tudelft.ti2806.riverrush.screen.WaitingScreen.TIMER_LABEL_HEIGHT_MULTIPLIER)));
    this.stage.addActor(this.timer);
}