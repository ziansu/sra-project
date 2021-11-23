private boolean enoughPeriodsPerWeek() {
    for (classscheduling.Course course : classscheduling.Course.values()) {
        boolean ok = schedule.enoughPeriodsPerWeek(course);
        if (!ok) {
            return false;
        }
    }
    return true;
}