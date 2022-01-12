@java.lang.Override
public void update() {
    uk.me.webpigeon.util.Vector2D targetForce = behavour.process();
    x += targetForce.getX();
    y += targetForce.getY();
    location.add(targetForce);
    velocity = uk.me.webpigeon.util.Vector2D.add(targetForce, velocity, uk.me.webpigeon.world.SteeringEntity.VECTOR_SMOOTHING);
    previousLocations.add(new uk.me.webpigeon.util.Vector2D(location));
    location.wrap(world.width, world.height);
}