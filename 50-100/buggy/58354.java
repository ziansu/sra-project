@asteroids.tests.Test
public final void ResolveShipWorldCollision_right() {
    asteroids.tests.ShipTestsPart2.collisionShip1.setWorld(asteroids.tests.ShipTestsPart2.world1);
    asteroids.tests.ShipTestsPart2.collisionShip1.setPosition(990, 0);
    asteroids.tests.ShipTestsPart2.collisionShip1.resolveCollision(asteroids.tests.ShipTestsPart2.world1);
    asteroids.model.Vector2D supposedVelocity = new asteroids.model.Vector2D((-100), 0);
    assertEquals(asteroids.tests.ShipTestsPart2.collisionShip1.getVelocity(), supposedVelocity);
}