private boolean isDateAndTimeValid(main.Task task) {
    int starttime = task.getStartTimeInt();
    int endtime = task.getEndTimeInt();
    if (task.isDateValid()) {
        if ((starttime != (-1)) && (endtime != (-1))) {
            return endtime > starttime;
        }else {
            return true;
        }
    }else {
        return false;
    }
}