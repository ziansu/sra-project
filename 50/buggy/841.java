@org.junit.Test
public void getClassDayLessons() throws java.lang.Exception {
    java.util.List<ActionEntities.ScheduleClassLesson> lessonList = Services.Impl.ScheduleServiceTest.service.GetClassDayLessons(1, 0);
    org.junit.Assert.assertNotNull(lessonList);
    org.junit.Assert.assertTrue(((lessonList.size()) > 0));
}