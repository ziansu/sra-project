@java.lang.Override
public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    for (com.packtpub.libgdx.canyonbunny.game.objects.Clouds.Cloud cloud : clouds) {
        clouds.render(batch);
    }
}