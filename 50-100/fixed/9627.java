private void inputDetection() {
    if (Gdx.input.isKeyPressed(Keys.SPACE)) {
        gameController.jumpRetroMan();
    }
    if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
        gameController.goRightRetroMan();
    }else
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            gameController.goLeftRetroMan();
        }
    
}