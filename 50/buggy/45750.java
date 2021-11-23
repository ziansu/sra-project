@org.junit.Test
public void estimateBallsZeros() {
    junit.framework.Assert.assertEquals(0, com.vibbix.ballroom.BallroomCalc.estimateBalls(0.0, 0.0, 0.0, 0.0, 0.0, BallroomCalc.CUBCM_PER_CUBM));
}