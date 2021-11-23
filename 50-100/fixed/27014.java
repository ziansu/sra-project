@asteroids.tests.Test
public final void ResolveShipWorldCollision_left() {
    asteroids.tests.ShipTestsPart2.collisionShip2.setPosition(10, 100);
    asteroids.tests.ShipTestsPart2.collisionShip2.setWorld(asteroids.tests.ShipTestsPart2.world1);
    asteroids.tests.ShipTestsPart2.collisionShip2.resolveCollision(asteroids.tests.ShipTestsPart2.world1);
    asteroids.model.Vector2D supposedVelocity = new asteroids.model.Vector2D(100, 0);
    assertEquals(asteroids.tests.ShipTestsPart2.collisionShip2.getVelocity(), supposedVelocity);
}