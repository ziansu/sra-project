@org.junit.Test
public void testFailTaskTestName_TestNameIsCorrect() {
    org.framework.core.runtime.FailTask task = new org.framework.core.runtime.FailTask("test", null, null);
    org.junit.Assert.assertEquals(task.getTaskName(), "test");
    assertNotEquals(task.getTaskName(), "tesp");
}