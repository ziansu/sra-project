@java.lang.Override
public com.badlogic.gdx.math.Vector2 getSize() {
    com.badlogic.gdx.math.Rectangle bounds = dclib.geometry.VertexUtils.bounds(polygon.getVertices());
    bounds.width *= polygon.getScaleX();
    bounds.height *= polygon.getScaleY();
    return bounds.getSize(new com.badlogic.gdx.math.Vector2());
}