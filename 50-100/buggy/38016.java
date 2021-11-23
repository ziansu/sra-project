public void testPlayerShootBomb() {
    nl.delftelectronics.spaceinvaders.core.entities.Ship ship = new nl.delftelectronics.spaceinvaders.core.entities.Ship(10, 10, 10, 10, 10, 10);
    nl.delftelectronics.spaceinvaders.core.scenes.GameScene scene = org.mockito.Mockito.mock(nl.delftelectronics.spaceinvaders.core.scenes.GameScene.class);
    ship.initialize(scene);
    ship.playerShootBomb();
    org.mockito.Mockito.verify(scene).addEntity(org.mockito.Matchers.any(nl.delftelectronics.spaceinvaders.core.entities.Bomb.class));
}