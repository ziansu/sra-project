@org.junit.Test
public void isFinished() {
    assertTrue(new Interval.Countdown("0:00", null).isFinished());
    assertFalse(new Interval.Countdown("0:01", null).isFinished());
    assertFalse(new Interval.Countdown("1:00", null).isFinished());
    assertFalse(new Interval.Countdown("3:25", null).isFinished());
}