@org.jbehave.core.annotations.Then(value = "Alarm should ring at $alarmTime")
public void alarmRinged(java.lang.String alarmTime) {
    org.junit.Assert.assertTrue(alarm.shouldRing());
    org.mockito.Mockito.verify(time).getTime().equals(alarmTime);
}