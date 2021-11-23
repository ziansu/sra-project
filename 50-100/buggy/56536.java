@java.lang.Override
public java.lang.String call() throws java.lang.Exception {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTimeInMillis(fr.delcey.cinereminday.CRDTimeManager.getEpoch());
    calendar.add(java.util.Calendar.DAY_OF_YEAR, 7);
    fr.delcey.cinereminday.CRDTimeManager.setEpoch(calendar.getTimeInMillis());
    activity.manageCardviews();
    fr.delcey.cinereminday.CRDUtils.scheduleWeeklyAlarm(activity);
    return "Leaped forward in time of 7 days. Today is now " + (fr.delcey.cinereminday.CRDUtils.epochToHumanReadableDate(calendar.getTimeInMillis()));
}