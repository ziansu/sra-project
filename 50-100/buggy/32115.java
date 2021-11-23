public static final com.badlogic.gdx.math.Vector2 size(final com.badlogic.gdx.math.Polygon polygon) {
    com.badlogic.gdx.math.Rectangle bounds = dclib.geometry.VertexUtils.bounds(polygon.getVertices());
    bounds.width *= polygon.getScaleY();
    bounds.height *= polygon.getScaleX();
    return bounds.getSize(new com.badlogic.gdx.math.Vector2());
}