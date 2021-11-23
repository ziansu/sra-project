@org.junit.Test
public void isSpeedChanged() {
    VD.bus.setCurrentSISpeed(10);
    VD.engine.setAcceleration(1);
    VD.SetSpeed();
    org.junit.Assert.assertEquals(((VD.bus.getCurrentSISpeed()) == 11), true);
}