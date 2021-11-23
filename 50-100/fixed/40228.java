private void loadTasksString(java.lang.String allLines) throws java.text.ParseException {
    java.lang.String[] allLinesArray = allLines.split(Storage.BY_NEXTLINE);
    for (int i = 0; i < (allLinesArray.length); i++) {
        loadTaskString(allLinesArray[i]);
    }
}