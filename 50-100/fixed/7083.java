public static void drawSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite, com.badlogic.gdx.graphics.g2d.Batch batch, float x, float y, float w, float h) {
    if (sprite != null) {
        batch.begin();
        batch.draw(sprite, x, (((net.awhipple.zombiebird.ZBGame.SCREEN_H) - y) - h), w, h);
        batch.end();
    }
}