@org.junit.Test
public void test2() {
    user.overrideJoystickPosition(4);
    controller.followSpeed();
    user.overrideJoystickPosition((-5));
    controller.followSpeed();
    org.junit.Assert.assertEquals((-1), controller.getReferenceSpeed());
}