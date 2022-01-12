public java.lang.String getState() {
    java.lang.StringBuilder tasksString = new java.lang.StringBuilder();
    tasksString.append(com.rhodes.chris.taskpopper.TaskAdapter.taskList.get(0).getDesc());
    for (int i = 1; i < (com.rhodes.chris.taskpopper.TaskAdapter.taskList.size()); i++) {
        tasksString.append(",");
        tasksString.append(com.rhodes.chris.taskpopper.TaskAdapter.taskList.get(i).getDesc());
    }
    return tasksString.toString();
}