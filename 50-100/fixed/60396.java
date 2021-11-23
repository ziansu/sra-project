public static void initialize() {
    logic.TaskProcessor.listToDisplay = new java.util.ArrayList<java.lang.String>();
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