public void toggleComplete(int id) {
    if (id != 0) {
        com.anoopkini.dotodo.web.models.TaskObject newTask = taskObjectDao.getTaskById(id);
        if (newTask != null) {
            if (newTask.isComplete()) {
                newTask.setComplete(false);
                newTask.setCompletedTS(null);
            }else {
                newTask.setComplete(true);
                newTask.setCompletedTS(new java.util.Date());
            }
            newTask.setModifiedTS(new java.util.Date());
            taskObjectDao.update(newTask);
        }
    }
}