private boolean notTooManyPeriodsPerWeek(classscheduling.Grade grade, classscheduling.Course course) {
    if ((course.getPeriodsScheduled(grade)) > (course.periods)) {
        schedule.errors.add(((grade + ": too many periods of ") + (course.name)));
        return false;
    }
    return true;
}