@java.lang.Override
public void draw(com.badlogic.gdx.graphics.g2d.Batch batch, float parentAlpha) {
    for (int i = 0; i < (wp); i++) {
        for (int j = 0; j < (hp); j++) {
            batch.draw(region, ((xp) + (i * 36)), ((yp) + (j * 36)));
        }
    }
}