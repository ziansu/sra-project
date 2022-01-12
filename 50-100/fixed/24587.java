private boolean checkIfEventTask(java.util.ArrayList<java.lang.String> taskItems) {
    LAST_POSITION_OF_FROM = taskItems.lastIndexOf(KEYWORD_FROM);
    LAST_POSITION_OF_TO = taskItems.lastIndexOf(KEYWORD_TO);
    if (((LAST_POSITION_OF_FROM) < (LAST_POSITION_OF_TO)) && ((LAST_POSITION_OF_FROM) != (-1))) {
        if (checkForDateAndTime(LAST_POSITION_OF_FROM, LAST_POSITION_OF_TO)) {
            return true;
        }else {
            setTaskType(TASK_TYPE.FLOATING);
            return false;
        }
    }else {
        return false;
    }
}