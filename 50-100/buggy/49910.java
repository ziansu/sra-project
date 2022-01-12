public com.badlogic.gdx.math.Vector2 screenToWorldCoords(com.badlogic.gdx.math.Vector2 screenPosition) {
    com.badlogic.gdx.math.Vector2 worldPosition = new com.badlogic.gdx.math.Vector2();
    worldPosition.x = ((screenPosition.x) + (camera.position.x)) - ((Gdx.graphics.getWidth()) / 2);
    worldPosition.y = ((((-(screenPosition.y)) + (map.getTotalHeight())) - (camera.position.y)) - ((Gdx.graphics.getHeight()) / 2)) - 160;
    return worldPosition;
}