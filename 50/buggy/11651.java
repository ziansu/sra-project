@java.lang.Override
public void show() {
    Gdx.input.setInputProcessor(world.player.controller);
    Gdx.input.setCursorCatched(true);
    world.music(true);
}