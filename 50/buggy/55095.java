@java.lang.Override
public com.example.annakocheshkova.testapplication.Model.Task getTask(int id) {
    com.example.annakocheshkova.testapplication.Model.Task task = simpleTaskDao.queryForId(id);
    java.util.List<com.example.annakocheshkova.testapplication.Model.SubTask> subTasks = getAllSubtasksByTask(task);
    task.setSubTasks(subTasks);
    return task;
}