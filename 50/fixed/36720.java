@org.junit.Test
public void testForward() {
    autoParker.AutoParkImpl autoPark = new autoParker.AutoParkImpl();
    autoPark.moveForward();
    junit.framework.Assert.assertEquals(1, autoPark.getPosition(), 0);
}