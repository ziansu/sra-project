@org.junit.Test
public void should_return_task() {
    taskDAO.save(new com.ngpanwei.taskit.model.Task("assignment1", "write application", "not started"));
    taskDAO.save(new com.ngpanwei.taskit.model.Task("assignment2", "write spring-boot", "not started"));
    java.util.List<com.ngpanwei.taskit.model.Task> taskList;
    taskList = taskDAO.findByName("assignment1");
    assert (taskList.get(0)) == null;
}