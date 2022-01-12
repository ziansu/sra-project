public static com.badlogic.gdx.math.Vector2 toHexCenterWorldCoord(int xGrid, int yGrid, float w, float h, float depth) {
    float x = 0;
    float y = 0;
    y = ((((yGrid * h) * 3) / 4.0F) + (h / 2)) + depth;
    x = ((xGrid * w) + (((yGrid % 2) * w) / 2.0F)) + (w / 2);
    return new com.badlogic.gdx.math.Vector2(x, y);
}