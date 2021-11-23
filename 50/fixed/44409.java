public int countConflicts() {
    if ((actualCourseClass) != null)
        return actualCourseClass.getOrderConflict(actualCourseDay, actualCourseTime, duration);
    else
        return 0;
    
}