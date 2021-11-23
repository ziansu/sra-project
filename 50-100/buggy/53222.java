@java.lang.Override
public void endContact(com.badlogic.gdx.physics.box2d.Contact contact) {
    short cb1 = contact.getFixtureA().getFilterData().categoryBits;
    short cb2 = contact.getFixtureB().getFilterData().categoryBits;
    com.badlogic.gdx.physics.box2d.Body b1 = contact.getFixtureA().getBody();
    com.badlogic.gdx.physics.box2d.Body b2 = contact.getFixtureB().getBody();
    for (com.alesegdia.asroth.systems.PhysicsSystem.ICollisionCallback icb : callbacks) {
        if (HandleEndCollision(cb1, cb2, b1, b2, icb)) {
            break;
        }
    }
}