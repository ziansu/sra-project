public static com.badlogic.gdx.math.Vector2 toHexCenterWorldCoord(int xGrid, int yGrid, float w, float h, float depth) {
    float y = ((((yGrid * h) * 3) / 4.0F) + (h / 2)) + depth;
    float x = ((xGrid * w) + (w / 2.0F)) - (((yGrid % 2) * w) / 2);
    return new com.badlogic.gdx.math.Vector2(x, y);
}