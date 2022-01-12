@org.junit.Test
public void takeDamageTest() {
    com.saints.gamecode.HealthBar healthBar = com.saints.gamecode.HealthBar.getInstance();
    int currentDivider;
    currentDivider = healthBar.getDivider();
    healthBar.updateDivider(5);
    junit.framework.TestCase.assertTrue(((currentDivider + 5) == (healthBar.getDivider())));
}