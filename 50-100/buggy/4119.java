@org.junit.Test
public void test4() {
    taco = new hu.bme.mit.train.tachograph.TrainTachograph();
    user.overrideJoystickPosition(3);
    controller.followSpeed();
    taco.recordValues(new java.util.Date(), user.getJoystickPosition(), controller.getReferenceSpeed());
    user.overrideJoystickPosition(6);
    controller.followSpeed();
    taco.recordValues(new java.util.Date(), user.getJoystickPosition(), controller.getReferenceSpeed());
    org.junit.Assert.assertEquals(2, taco.getNumberOfElements());
}