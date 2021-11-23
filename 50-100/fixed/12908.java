private boolean editTask(java.lang.String rawInput) {
    java.util.ArrayList<java.lang.String> inputParts = breakString(rawInput);
    int taskID = convertToInt(getTaskID(inputParts));
    java.lang.String date = getDateFromRaw(inputParts);
    if (isInvalidID(taskID)) {
        return false;
    }
    return logic.editTask(taskID, date);
}