public boolean isScheduleSet() {
    boolean result = false;
    for (int i = 4; i <= 24; i++) {
        if ((!(this.holidaySchedule.get(i).isEmpty())) && (!(this.weekdaySchedule.get(i).isEmpty()))) {
            result = true;
            break;
        }
    }
    return result;
}