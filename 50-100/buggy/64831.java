public int getMapBlockAtPosition(com.badlogic.gdx.math.Vector2 position) {
    int row = com.badlogic.gdx.math.MathUtils.floor(((position.x) / 50));
    int col = com.badlogic.gdx.math.MathUtils.floor(((position.y) / 50));
    return getMapBlockAt(row, col);
}