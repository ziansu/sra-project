private boolean enoughPeriodsPerWeek(classscheduling.Course course) {
    boolean result = true;
    for (classscheduling.Grade g : classscheduling.Grade.values()) {
        if ((course.getPeriodsScheduled(g)) < (course.periods)) {
            errors.add(((g + ": not enough periods of ") + (course.name)));
            result = false;
        }
    }
    return result;
}