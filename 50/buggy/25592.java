@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.Batch batch, float alpha) {
    if ((menu) != null) {
        menu.draw(batch, alpha);
    }
    enemy.draw(batch, alpha);
    player.draw(batch, alpha);
}