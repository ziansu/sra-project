public static void drawSprite(com.badlogic.gdx.graphics.g2d.Sprite sprite, com.badlogic.gdx.graphics.g2d.Batch batch, float x, float y, float w, float h) {
    if (sprite != null) {
        batch.begin();
        sprite.setPosition(x, (((net.awhipple.zombiebird.ZBGame.SCREEN_H) - y) - (sprite.getHeight())));
        sprite.setSize(w, h);
        sprite.draw(batch);
        batch.end();
    }
}