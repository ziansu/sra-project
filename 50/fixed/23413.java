@org.junit.Test
public void test2() {
    user.overrideJoystickPosition(4);
    controller.followSpeed();
    user.overrideJoystickPosition((-5));
    controller.followSpeed();
    org.junit.Assert.Assert.assertEquals(0, controller.getReferenceSpeed());
}