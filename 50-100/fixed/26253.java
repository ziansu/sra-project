@org.junit.Test
public void shouldReturnCurrentDatePlus1Minute() {
    org.mockito.Mockito.when(settingsProvider.getCurrentDate()).thenReturn(navigator.TestUtil.getCalendar(2015, 10, 17, 12, 20));
    java.util.Date expectedRuntime = navigator.TestUtil.getDate(2015, 10, 17, 12, 21);
    java.util.Date nextRuntime = nextRunTimeCalculator.calculateNextRuntime(getPlayers());
    junit.framework.TestCase.assertEquals(true, org.apache.commons.lang3.time.DateUtils.isSameInstant(expectedRuntime, nextRuntime));
}