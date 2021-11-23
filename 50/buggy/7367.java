@org.junit.Test
public void getUpdateSubTasksTest() {
    boolean param;
    param = true;
    task.setUpdateSubTasks(param);
    assertEquals(task.getUpdateSubTasks(), param);
}