public float height() {
    float min = min();
    float max = 0;
    for (com.badlogic.gdx.math.Vector2 vector : vertices) {
        max = java.lang.Math.max(max, vector.y);
    }
    return max - min;
}