@java.lang.Override
public void onFinishedWithResult(java.lang.String monthName, int day, int year, long time) {
    if (setDateFromTime) {
        if (time < (dateToTime))
            dateFromTime = time;
        
    }else {
        if (time > (dateFromTime))
            dateToTime = time;
        
    }
    updateDateRangeLabels();
}