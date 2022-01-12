private void loadTasksString(java.lang.String allLines) throws java.text.ParseException {
    Storage.storageLogger.info("File loaded. Passing contents to load into tasks buffer.");
    java.lang.String[] allLinesArray = allLines.split(Storage.BY_NEXTLINE);
    for (int i = 0; i < (allLinesArray.length); i++) {
        loadTaskString(allLinesArray[i]);
    }
}