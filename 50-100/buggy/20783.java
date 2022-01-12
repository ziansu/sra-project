public static com.badlogic.gdx.math.Vector2 getAxialNeighbor(com.badlogic.gdx.math.Vector2 axial, int direction) {
    com.badlogic.gdx.math.Vector2 dir = com.tint.wotn.utils.HexCoordinates.AXIAL_DIRS[direction];
    com.badlogic.gdx.math.Vector2 result = new com.badlogic.gdx.math.Vector2(((axial.x) + (dir.x)), ((axial.y) + (dir.y)));
    return result;
}