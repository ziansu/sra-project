@org.junit.Test
public void testCreate() {
    com.janantoniak.GameOfLife.Ground ground = new com.janantoniak.GameOfLife.Ground(10, 10);
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            org.junit.Assert.assertNotNull(ground.getCell(i, j));
            org.junit.Assert.assertEquals(ground.isAlive(i, j), false);
        }
    }
}