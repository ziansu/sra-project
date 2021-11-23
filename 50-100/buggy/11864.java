@java.lang.Override
public void render(com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    for (int currentX = 0; currentX < (innerTiles.length); currentX++) {
        for (int currentY = 0; currentY < (innerTiles[0].length); currentY++) {
            innerTiles[currentX][currentY].render(batch);
        }
    }
    super.render(batch);
}