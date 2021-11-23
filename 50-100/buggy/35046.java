private logic.TaskObject deleteFunction(logic.CommandObject commandObj) {
    logic.TaskObject removedTask = new logic.TaskObject();
    logic.Delete delete = new logic.Delete(commandObj, taskList, lastOutputTaskList);
    setOutput(delete.run());
    setLastOutputTaskList(taskList);
    removedTask = delete.getRemovedTask();
    return removedTask;
}