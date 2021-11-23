@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.Batch batch, float alpha) {
    com.badlogic.gdx.graphics.g2d.Sprite s;
    if ((front) > 0) {
        s = mon.getFrontSprite();
    }else {
        s = mon.getBackSprite();
    }
    batch.draw(s, ((x) - ((s.getWidth()) / 2)), y);
}