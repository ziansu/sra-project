@org.junit.Test
public void validateKernelProperties() {
    game.weapons.Kernel kernel = new game.weapons.Kernel();
    game.entities.Tower tower = new game.entities.Tower(0, 0, reader.readTowerInfo("kernel"), kernel);
    tower.setAnimation(Direction.Up);
    org.junit.Assert.assertEquals(200, kernel.getAttackRadius());
    org.junit.Assert.assertEquals(2, kernel.getRateOfFire());
    org.junit.Assert.assertEquals(10, kernel.getDamage());
    org.junit.Assert.assertEquals(4, kernel.getProjectileRadius());
}