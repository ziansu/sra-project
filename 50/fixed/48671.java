@org.junit.Test
public void stayPowerTest() {
    assertEquals(com.sem.btrouble.model.PowerUpFactory.generate(1, 1, 0.05), new com.sem.btrouble.model.StayRopePowerUp(1, 1));
}