@org.junit.Test
public void testMangosteenSleepwithoutwater4Days() {
    sleepless.farmapp.model.PlantList.Mangosteen m = new sleepless.farmapp.model.PlantList.Mangosteen();
    for (int i = 0; i < 4; i++) {
        m.plantSleep();
    }
    assertEquals(4, m.getContPlantWater());
    assertEquals(10, m.getContHealth());
}