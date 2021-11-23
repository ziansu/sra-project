@java.lang.Override
public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch sb) {
    border.render();
    playerTop.render();
    playerBottom.render();
    for (com.airse.trickyduel.models.Bullet bullet : bullets) {
        bullet.render(border);
    }
}