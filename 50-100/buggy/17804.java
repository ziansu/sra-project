@org.testng.annotations.Test
public void createTest() {
    java.util.List<cz.muni.fi.pa165.saes.entity.BurnedCalories> calories = new java.util.ArrayList<>();
    calories.add(calory);
    when(caloriesDao.findBySportActivity(activityRecord1.getActivity())).thenReturn(calories);
    activityRecordService.create(activityRecord1);
    assertNotNull(activityRecord1.getBurnedCalories());
    verify(activityRecordDAO).create(activityRecord1);
}