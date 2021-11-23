public java.util.ArrayList<logic.Task> completeCommand(int taskID) {
    int index = taskID - 1;
    logic.Task doneTask = logic.Execution.mainList.get(index);
    logic.Execution.doneList.add(doneTask);
    deleteTask(taskID);
    return logic.Execution.doneList;
}