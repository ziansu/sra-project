@org.junit.Test
public void testFailTaskValue1IsCorrect() {
    org.framework.core.runtime.FailTask task = new org.framework.core.runtime.FailTask("test", 1, null);
    org.junit.Assert.assertEquals(task.getValue1(), 1);
    org.junit.Assert.assertNotEquals(task.getValue1(), 59);
}