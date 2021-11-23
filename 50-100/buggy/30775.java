private com.badlogic.gdx.math.Vector2 inside(com.badlogic.gdx.math.Vector2 v, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2) {
    return new com.badlogic.gdx.math.Vector2(((float) (java.lang.Math.min(java.lang.Math.max(p1.x, v.x), p2.x))), ((float) (java.lang.Math.min(java.lang.Math.max(p1.y, v.y), p2.y))));
}