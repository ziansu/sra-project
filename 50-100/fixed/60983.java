createTask(net.sf.memoranda.Task task) {
    net.sf.memoranda.Task newTask = task.deepCopy();
    newTask.setID(net.sf.memoranda.util.Util.generateId());
    rootTaskList.add(newTask);
    taskList.put(newTask.getID(), newTask);
    return newTask;
}