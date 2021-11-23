br.com.kdev.task.Task getTaskObject(java.lang.String taskJSON) {
    br.com.kdev.task.Task task = null;
    try {
        task = mapper.readValue(taskJSON, br.com.kdev.task.Task.class);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return task;
}