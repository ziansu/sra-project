private com.badlogic.gdx.math.Vector2 getTranslationOffset(final com.badlogic.gdx.math.Polygon collider, final com.badlogic.gdx.math.Polygon collidee) {
    com.badlogic.gdx.math.Vector2 offset = new com.badlogic.gdx.math.Vector2();
    com.badlogic.gdx.math.Intersector.MinimumTranslationVector translation = new com.badlogic.gdx.math.Intersector.MinimumTranslationVector();
    if (com.badlogic.gdx.math.Intersector.overlapConvexPolygons(collider, collidee, translation)) {
        offset = translation.normal.cpy().scl(translation.depth);
        offset.setLength(translation.depth);
    }
    return offset;
}