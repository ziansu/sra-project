@org.junit.Test
public void testCreateTask() throws java.lang.Exception {
    rest.task.TaskRepository taskRepository = new rest.task.TaskRepository();
    rest.task.Task task = new rest.task.Task();
    task.setTask("Name");
    task.setDone(false);
    assertEquals(true, taskRepository.getAll().isEmpty());
    assertEquals(task, taskRepository.add(task));
    assertEquals(false, taskRepository.getAll().isEmpty());
    assertEquals(1, taskRepository.getById(1L).getId());
}