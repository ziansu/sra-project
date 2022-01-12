@org.testng.annotations.Test
public void createTest() {
    when(caloriesDao.findBySportActivity(activityRecord1.getActivity())).thenReturn(calories);
    activityRecordService.create(activityRecord1);
    assertNotNull(activityRecord1.getBurnedCalories());
    assertTrue(((activityRecord1.getBurnedCalories()) > 0));
    verify(activityRecordDAO).create(activityRecord1);
}