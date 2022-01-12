@java.lang.Override
public int addTask(java.lang.Integer task_type) {
    com.cjs.model.Task task = new com.cjs.model.Task();
    task.setUser_id(com.cjs.util.session.SessionUtil.getCurrentUser().getId());
    task.setTask_done(0);
    task.setTask_type(task_type);
    task.setTask_priority(0);
    taskDao.save(task);
    return task.getId();
}