private boolean isDateAndTimeValid(main.Task task) {
    int starttime = task.getStartTimeInt();
    int endtime = task.getEndTimeInt();
    switch (task.isDateValid()) {
        case 1 :
            return true;
        case -1 :
            return false;
        case 0 :
            if ((starttime != (-1)) && (endtime != (-1))) {
                return endtime > starttime;
            }else {
                return true;
            }
    }
    assert false;
    return false;
}