@org.junit.Test
public void testRetrieveAllYears() {
    java.util.List<java.lang.Integer> years = new java.util.ArrayList<java.lang.Integer>();
    years.add(2004);
    years.add(2005);
    years.add(2003);
    org.mockito.Mockito.when(weightRecordingDao.retrieveAllYears()).thenReturn(years);
    java.util.List<com.verndale.pmp.bean.LabelValueBean> result = weightRecordingService.retrieveAllYears();
    assertEquals("2003", result.get(0).getValue());
}