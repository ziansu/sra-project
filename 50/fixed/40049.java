@org.junit.Test
public void threadedControllerTest() {
    org.usfirst.team1699.test.motorController.TestController tst1 = new org.usfirst.team1699.test.motorController.TestController();
    org.usfirst.frc.team1699.utils.drive.TimeControlledMotor tstTime1 = new org.usfirst.frc.team1699.utils.drive.TimeControlledMotor(tst1);
    tstTime1.start();
    java.lang.System.out.println(tstTime1.getSpeed());
}