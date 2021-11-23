@org.junit.Test
public void testCheckExactCollision() {
    gameplayTest.Bomberman bomberman = new gameplayTest.Bomberman(0, 0);
    gameplayTest.GridObject a = new gameplayTest.GridObject(0, 0);
    assertTrue(gameplayTest.CollisionDetectorTest.detector.checkExactCollision(bomberman, a));
    gameplayTest.GridObject b = new gameplayTest.GridObject(2, 2);
    assertTrue(gameplayTest.CollisionDetectorTest.detector.checkExactCollision(bomberman, a));
    gameplayTest.Bomberman testNull = null;
    gameplayTest.GridObject c = null;
    assertFalse(gameplayTest.CollisionDetectorTest.detector.checkExactCollision(testNull, c));
}