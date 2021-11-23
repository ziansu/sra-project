public void update(float deltaTime) {
    this.levelController.update(deltaTime);
    this.frogManager.update(deltaTime);
    if ((this.hud.getLifeCounter().getLife()) <= 0) {
        game.setScreen(new com.mygdx.game.screens.GameOverScreen(this.game));
        com.mygdx.game.sprites.SpritesDrawer.getInstance().removeAllSprites();
        Gdx.input.setInputProcessor(null);
        this.hud.reset();
    }
}