@org.junit.Test
public void testUpdateSpeed() {
    org.usfirst.frc.team4180.robot.Climber climber = new org.usfirst.frc.team4180.robot.Climber(CLIMBER_PORT, TOP_SWITCH_PORT);
    setDigitalInputOnPortTo(TOP_SWITCH_PORT, false);
    resetTest();
    climber.updateSpeed(new double[]{ 0 , 4 , 0 });
    org.junit.Assert.assertEquals(4, climber.getSpeed(), 0);
    resetTest();
    climber.updateSpeed(new double[]{ 0 , 2 , 0 });
    org.junit.Assert.assertEquals(2, climber.getSpeed(), 0);
}