@org.junit.Test
public void equalsTrueTest() {
    com.sem.btrouble.model.StayRopePowerUp compare = new com.sem.btrouble.model.StayRopePowerUp(1, 1, 10);
    assertTrue(compare.equals(power));
}