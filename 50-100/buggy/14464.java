private void setStage(com.badlogic.gdx.scenes.scene2d.ui.Label titleLabel, com.badlogic.gdx.scenes.scene2d.ui.Label highestScoreLabel, com.nitsanmichael.popping_frog_game.scenes.ToggleButton playButton, com.nitsanmichael.popping_frog_game.scenes.ToggleButton settingsButton, com.nitsanmichael.popping_frog_game.scenes.ToggleButton heroButton) {
    this.stage = new com.badlogic.gdx.scenes.scene2d.Stage(new com.badlogic.gdx.utils.viewport.FitViewport(com.nitsanmichael.popping_frog_game.PoppingFrog.VIRTUAL_WIDTH, com.nitsanmichael.popping_frog_game.PoppingFrog.VIRTUAL_HEIGHT, new com.badlogic.gdx.graphics.OrthographicCamera()), this.game.batch);
    this.stage.addActor(titleLabel);
    this.stage.addActor(highestScoreLabel);
    this.stage.addActor(playButton);
    this.stage.addActor(settingsButton);
    this.stage.addActor(heroButton);
    Gdx.input.setInputProcessor(this.stage);
}