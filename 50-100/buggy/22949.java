private static com.badlogic.gdx.math.Vector2 levelToPhysicsPosition(float x, float y) {
    x /= com.inhavok.fallen.Application.PIXELS_PER_METER;
    y /= -(com.inhavok.fallen.Application.PIXELS_PER_METER);
    y += ((com.inhavok.fallen.states.Level.tiles.length) * (com.inhavok.fallen.states.Level.tileSize)) / (com.inhavok.fallen.Application.PIXELS_PER_METER);
    return new com.badlogic.gdx.math.Vector2(x, y);
}