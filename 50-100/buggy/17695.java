@org.junit.Test
public void shouldReturnNextTimeIn24Hours() {
    org.mockito.Mockito.when(settingsProvider.getCurrentDate()).thenReturn(navigator.TestUtil.getCalendar(2015, 10, 17, 12, 10));
    java.util.Date expectedRuntime = navigator.TestUtil.getDate(2015, 10, 18, 12, 10);
    java.util.Date nextRuntime = nextRunTimeCalculator.calculateNextRuntime(new java.util.ArrayList<model.Player>(), null);
    junit.framework.TestCase.assertEquals(true, org.apache.commons.lang3.time.DateUtils.isSameInstant(expectedRuntime, nextRuntime));
}