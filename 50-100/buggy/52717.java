public boolean hasOverlap(com.wylder.shuttlewidget.ScheduleConstraint constraint) {
    if (((constraint.hourStart) >= (this.hourEnd)) || ((constraint.hourEnd) < (this.hourStart))) {
        return false;
    }else {
        for (int i = 0; i < (ShuttleConstants.DAYS_OF_THE_WEEK); i++) {
            if ((constraint.daysActive[i]) && (this.daysActive[i])) {
                return true;
            }
        }
        return false;
    }
}