private boolean enoughPeriodsPerWeek(classscheduling.Course course) {
    for (classscheduling.Grade g : classscheduling.Grade.values()) {
        if ((course.getPeriodsScheduled(g)) < (course.periods)) {
            errors.add(((g + ": not enough periods of ") + (course.name)));
            return false;
        }
    }
    return true;
}