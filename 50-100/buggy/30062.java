public void draw(com.badlogic.gdx.graphics.g2d.SpriteBatch batch, com.badlogic.gdx.math.Vector2 playerPos, com.badlogic.gdx.math.Vector2 screenRes) {
    batch.draw(sprite, (((x) - (playerPos.x)) - ((screenRes.x) / 2)), (((y) - (playerPos.y)) - ((screenRes.y) / 2)), sprite.getRegionWidth(), sprite.getRegionHeight());
}