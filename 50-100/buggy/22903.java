@java.lang.Override
public void render(float delta) {
    update(delta);
    sb.begin();
    player.getSprite().draw(sb);
    player.getSprite().setX(((Gdx.graphics.getWidth()) / 2));
    player.getSprite().setY(((Gdx.graphics.getHeight()) / 2));
    b2dr.render(gameWORLD, cam.combined);
    sb.end();
}