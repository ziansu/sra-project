public int getIndexOfTodaysSchedule() {
    java.util.Date today = getTodaysDate();
    java.util.Date[] schedules = mWeeklySchedule.keySet().toArray(new java.util.Date[mWeeklySchedule.size()]);
    for (int i = 0; i < (schedules.length); i++) {
        if (schedules[i].equals(today))
            return i;
        
    }
    return -1;
}