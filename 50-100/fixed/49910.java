public com.badlogic.gdx.math.Vector2 screenToWorldCoords(com.badlogic.gdx.math.Vector2 screenPosition) {
    com.badlogic.gdx.math.Vector2 worldPosition = new com.badlogic.gdx.math.Vector2();
    worldPosition.x = ((camera.position.x) - ((Gdx.graphics.getWidth()) / 2)) + (screenPosition.x);
    worldPosition.y = ((camera.position.y) - ((Gdx.graphics.getHeight()) / 2)) + ((Gdx.graphics.getHeight()) - (screenPosition.y));
    return worldPosition;
}