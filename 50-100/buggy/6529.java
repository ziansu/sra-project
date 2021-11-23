public static logic.Task deleteTask(int taskNumberToDelete) throws java.io.IOException {
    assert taskNumberToDelete > 0;
    logic.Task deletedTask = null;
    if ((!(Storage.Storage.taskList.isEmpty())) && (taskNumberToDelete < (Storage.Storage.taskList.size()))) {
        Storage.Storage.logger.log(java.util.logging.Level.INFO, "Deleting Task from the ArrayList");
        deletedTask = Storage.Storage.taskList.remove((taskNumberToDelete - 1));
        Storage.Storage.saveTaskList();
    }
    return deletedTask;
}