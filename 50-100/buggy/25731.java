public static com.badlogic.gdx.math.Vector2 toWorldCoord(int xGrid, int yGrid, int zGrid, float w, float h, float depth) {
    float x = 0;
    float y = 0;
    y = (((yGrid * h) * 3) / 4.0F) + (zGrid * depth);
    x = (xGrid * w) - (((yGrid % 2) * w) / 2.0F);
    return new com.badlogic.gdx.math.Vector2(x, y);
}