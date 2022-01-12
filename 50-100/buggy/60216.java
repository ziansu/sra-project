@org.junit.Test
public void isFinished() {
    junit.framework.Assert.assertTrue(new Interval.Countdown("0:00", null).isFinished());
    junit.framework.Assert.assertFalse(new Interval.Countdown("0:01", null).isFinished());
    junit.framework.Assert.assertFalse(new Interval.Countdown("1:00", null).isFinished());
    junit.framework.Assert.assertFalse(new Interval.Countdown("3:25", null).isFinished());
}