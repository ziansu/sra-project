@org.junit.Test
public void parser_valid() {
    junit.framework.Assert.assertEquals("00:00", new Interval.Countdown("0:00", null).toReadableString());
    junit.framework.Assert.assertEquals("10:15", new Interval.Countdown("10:15", null).toReadableString());
}