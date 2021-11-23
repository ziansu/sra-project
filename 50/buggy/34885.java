public boolean isValidDateTime(java.lang.String date) {
    if ((date.length()) <= (seedu.taskboss.model.task.DateTime.EMPTY)) {
        return false;
    }else {
        return true;
    }
}