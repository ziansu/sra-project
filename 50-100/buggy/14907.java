public void handleInput() {
    if (com.brogrammers.tartaros.Tartaros.DEVELOP) {
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            com.badlogic.gdx.Gdx.app.exit();
        }
    }
    if ((Gdx.input.justTouched()) || (Gdx.input.isKeyPressed(Input.Keys.ENTER))) {
        game.setScreen(new com.brogrammers.tartaros.screens.MenuScreen(game));
    }
}