@org.junit.Test
public void killTest() {
    com.saints.gamecode.HealthBar healthbar = com.saints.gamecode.HealthBar.getInstance();
    int currentDivider = healthbar.getDivider();
    int currentP1Limit = healthbar.getP1Limit();
    int currentP2Limit = healthbar.getP2Limit();
    healthbar.killP1();
    currentDivider = healthbar.getDivider();
    junit.framework.TestCase.assertTrue((currentDivider == currentP1Limit));
    healthbar.killP2();
    currentDivider = healthbar.getDivider();
    junit.framework.TestCase.assertTrue((currentDivider == currentP2Limit));
}