@org.junit.Test
public void shouldReturnSameNextDateWhenPlayersDateIsNull() {
    org.mockito.Mockito.when(settingsProvider.getCurrentDate()).thenReturn(navigator.TestUtil.getCalendar(2015, 10, 17, 12, 10));
    java.util.Date nextDate = navigator.TestUtil.getDate(2015, 10, 17, 12, 20);
    java.util.Date nextRuntime = nextRunTimeCalculator.calculateNextRuntime(new java.util.ArrayList<model.Player>(), nextDate);
    junit.framework.TestCase.assertEquals(true, org.apache.commons.lang3.time.DateUtils.isSameInstant(nextDate, nextRuntime));
}