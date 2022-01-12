private boolean noCourseTwicePerDay(classscheduling.Course c, classscheduling.Day day, classscheduling.GradeDay gd) {
    if ((gd.count(c.code)) > 1) {
        schedule.errors.add(((((((gd.grade.name()) + ": too many ") + (c.name)) + " classes") + " on ") + (day.name)));
        return false;
    }
    return true;
}