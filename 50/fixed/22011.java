private com.seal_de.controller.Task processTask(com.seal_de.controller.Task task, java.lang.String userId, com.seal_de.controller.Paper paper) {
    task.setUserId(userId);
    task.setPaperId(paper);
    task.setStatus(10);
    return task;
}