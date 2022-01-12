@org.junit.Test
public void shouldReturnSameNextDateWhenPlayersDateIsAfterIt() {
    org.mockito.Mockito.when(settingsProvider.getCurrentDate()).thenReturn(navigator.TestUtil.getCalendar(2015, 10, 17, 12, 0));
    java.util.Date nextDate = navigator.TestUtil.getDate(2015, 10, 17, 12, 5);
    java.util.Date nextRuntime = nextRunTimeCalculator.calculateNextRuntime(getPlayers());
    junit.framework.TestCase.assertEquals(true, org.apache.commons.lang3.time.DateUtils.isSameInstant(nextDate, nextRuntime));
}