@java.lang.Override
public void onCollision(se.chalmers.get_rect.physics.IPhysicsObject otherObject, se.chalmers.get_rect.physics.CollisionData collisionSide, boolean isSolid) {
    if ((otherObject != null) && (collisionSide.top())) {
        otherObject.setVelocity(otherObject.getVelocity().setY(150));
        gotHit = true;
    }
}