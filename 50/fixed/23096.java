@java.lang.Override
public com.taskmaster.dao.entity.Task reopenTask(java.lang.Long id) throws java.lang.Exception {
    if (id != null) {
        com.taskmaster.dao.entity.Task t = tdao.findOne(id);
        t.setCompleteDate(null);
        return tdao.save(t);
    }
    return null;
}