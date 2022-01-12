@org.junit.Test
public void a_normal_pressure_value_should_not_raise_the_alarm() {
    kata.tpms.StubSensor stubSensor = new kata.tpms.StubSensor();
    stubSensor.arrangeNextPressurePsiValue(Alarm.LOW_PRESSURE_THRESHOLD);
    kata.tpms.Alarm alarm = new kata.tpms.Alarm(stubSensor);
    alarm.check();
    org.junit.Assert.assertFalse(alarm.isAlarmOn());
}