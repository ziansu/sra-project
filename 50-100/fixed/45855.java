@org.junit.Test
public void testConstructorAndGetters() {
    jfdi.storage.entities.Task task = new jfdi.storage.entities.Task(1, jfdi.storage.Constants.TEST_TASK_DESCRIPTION_1, jfdi.storage.Constants.TEST_TASK_STARTDATETIME, jfdi.storage.Constants.TEST_TASK_ENDDATETIME, false);
    assertEquals(new java.lang.Integer(1), task.getId());
    assertEquals(Constants.TEST_TASK_DESCRIPTION_1, task.getDescription());
    assertEquals(Constants.TEST_TASK_STARTDATETIME, task.getStartDateTime());
    assertEquals(Constants.TEST_TASK_ENDDATETIME, task.getEndDateTime());
    assertEquals(false, task.isCompleted());
}