public static void viewTask(java.lang.String text) {
    java.lang.String[] strArray = text.split(",");
    new someGroup.YetAnotherToDoList.client.TaskNotifier().viewTask(strArray[0], strArray[1], strArray[2], strArray[3]);
}