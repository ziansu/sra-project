public edu.ccbcmd.pathwayguide.CourseClass getCourseByName(java.lang.String name, int count, android.content.Context context) {
    for (edu.ccbcmd.pathwayguide.CourseClass course : sortedObject) {
        if (course.getTitle().equals(name)) {
            return course;
        }
    }
    return instantiateNewCourse(name, context);
}