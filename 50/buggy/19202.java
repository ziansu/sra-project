@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void illegalArgumentsTest() {
    java.lang.String time = "ItIsCertainlyNotTheTime";
    ru.vaddya.schedule.core.utils.Timer timer = ru.vaddya.schedule.core.utils.Timer.of(time);
}