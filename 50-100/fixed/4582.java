@org.junit.Test
public void test1() {
    sensor.overrideSpeedLimit(10);
    org.junit.Assert.assertEquals(0, controller.getReferenceSpeed());
    user.overrideJoystickPosition((-5));
    controller.followSpeed();
    org.junit.Assert.assertEquals(5, controller.getReferenceSpeed());
    controller.followSpeed();
    org.junit.Assert.assertEquals(10, controller.getReferenceSpeed());
    controller.followSpeed();
    org.junit.Assert.assertEquals(10, controller.getReferenceSpeed());
}