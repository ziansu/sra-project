@java.lang.Override
public com.badlogic.gdx.math.collision.BoundingBox getBoundingBox(net.luxvacuos.igl.vector.Vector3f pos) {
    return new com.badlogic.gdx.math.collision.BoundingBox(new com.badlogic.gdx.math.Vector3(((pos.x) + 0.3F), pos.y, ((pos.z) + 0.3F)), new com.badlogic.gdx.math.Vector3(((pos.x) + 0.7F), ((pos.y) + 1.0F), ((pos.z) + 0.7F)));
}