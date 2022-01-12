public static com.badlogic.gdx.math.Vector3 getCubeDiagonal(com.badlogic.gdx.math.Vector3 cube, int direction) {
    com.badlogic.gdx.math.Vector3 dir = com.tint.wotn.utils.HexCoordinates.CUBE_DIAGS[direction];
    com.badlogic.gdx.math.Vector3 result = new com.badlogic.gdx.math.Vector3(((cube.x) + (dir.x)), ((cube.y) + (dir.y)), ((cube.z) + (dir.z)));
    return result;
}