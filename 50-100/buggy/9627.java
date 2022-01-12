private void inputDetection() {
    if (Gdx.input.isKeyPressed(Keys.SPACE)) {
        gameController.jumpRetroMan();
    }
    if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
        gameController.goRightRetroMan();
        java.lang.System.out.println((((camera.position.x) + " ") + (camera.position.y)));
    }else
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            gameController.goLeftRetroMan();
        }
    
}