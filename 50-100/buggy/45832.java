public static void viewTask(java.lang.String text) {
    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(text, ",");
    java.lang.String[] strArray = new java.lang.String[4];
    for (int i = 0; i < 4; i++) {
        strArray[i] = stringTokenizer.nextToken();
    }
    new someGroup.YetAnotherToDoList.client.TaskNotifier().viewTask(strArray[0], strArray[1], strArray[2], strArray[3]);
}