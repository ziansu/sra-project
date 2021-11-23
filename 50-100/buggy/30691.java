public static com.project.backend.Course getCourseById(java.lang.String id) {
    java.lang.String[] courseId = id.split("-");
    if ((courseId.length) != 2) {
        return null;
    }
    return com.project.backend.DatabaseHandler.getCourseById(courseId[0], courseId[2]);
}