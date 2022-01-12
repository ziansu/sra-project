private boolean enoughPeriodsPerWeek() {
    boolean result = true;
    for (classscheduling.Course course : classscheduling.Course.values()) {
        boolean ok = enoughPeriodsPerWeek(course);
        if (!ok) {
            result = false;
        }
    }
    return result;
}