private void loadFile() throws java.io.IOException {
    java.lang.System.out.println("load file");
    taskList = fileOperation.getUnfinishedTaskListFromFile();
    completedTaskList = fileOperation.getFinishedTaskListFromFile();
    fileList = configurationFileOperation.getHistoryFilePath();
}