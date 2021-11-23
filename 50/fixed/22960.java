@java.lang.Override
public com.taskmaster.dao.entity.Task completeTask(java.lang.Long id) throws java.lang.Exception {
    if (id != null) {
        com.taskmaster.dao.entity.Task task = tdao.findOne(id);
        task.setCompleteDate(new java.util.Date());
        return tdao.save(task);
    }
    return null;
}