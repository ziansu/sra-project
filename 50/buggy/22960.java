@java.lang.Override
public void completeTask(java.lang.Long id) throws java.lang.Exception {
    if (id != null) {
        com.taskmaster.dao.entity.Task task = tdao.findOne(id);
        task.setCompleteDate(new java.util.Date());
        tdao.save(task);
    }
}