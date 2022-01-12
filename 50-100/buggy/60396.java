public static void initialize() {
    logic.TaskProcessor.listToDisplay = new java.util.ArrayList<java.lang.String>();
    logic.CommandQueue.initialize();
    logic.ResponseQueue.initialize();
    try {
        Storage.Storage.retrieveFile();
        java.util.ArrayList<logic.Task> taskList = Storage.Storage.loadTaskList();
        logic.TaskProcessor.loadIntoDisplayList(taskList);
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}