@java.lang.Override
public void render(float delta) {
    update(delta);
    sb.begin();
    player.setX(((Gdx.graphics.getWidth()) / 2));
    player.setY(((Gdx.graphics.getHeight()) / 2));
    player.draw(sb);
    b2dr.render(gameWORLD, cam.combined);
    sb.end();
}