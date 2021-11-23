public int countConflicts() {
    return actualCourseClass.getOrderConflict(actualCourseDay, actualCourseTime, duration);
}