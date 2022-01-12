@org.junit.Test
public void testViewCommandAll() throws java.io.IOException, taskie.tests.InvalidTaskException, taskie.tests.TaskModificationFailedException, taskie.tests.TaskRetrievalFailedException {
    setUp();
    generateTasks();
    taskie.tests.ViewCommand cmd = new taskie.tests.ViewCommand(taskie.models.ViewType.ALL);
    cmd.execute();
    taskie.tests.CommandTest._controller.getUI().display(taskie.tests.CommandTest._controller.getStorage().getTaskList().toArray(new taskie.models.Task[10]));
    org.junit.Assert.assertEquals(10, taskie.tests.CommandTest._controller.getUI().getCurrentTaskList().length);
}