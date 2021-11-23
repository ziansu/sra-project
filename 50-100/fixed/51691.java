@org.junit.Test
public void testDeleteTask() throws java.lang.Exception {
    rest.task.TaskRepository taskRepository = new rest.task.TaskRepository();
    rest.task.Task task = new rest.task.Task();
    task.setTask("Name");
    task.setDone(false);
    assertEquals(true, taskRepository.getAll().isEmpty());
    taskRepository.add(task);
    assertEquals(false, taskRepository.getAll().isEmpty());
    taskRepository.remove(0L);
    assertEquals(true, taskRepository.getAll().isEmpty());
}