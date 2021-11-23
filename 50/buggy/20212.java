@java.lang.Override
public final com.badlogic.gdx.math.Rectangle getBounds() {
    return net.dermetfan.gdx.physics.box2d.Box2DUtils.aabb(body);
}