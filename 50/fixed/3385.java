public java.lang.String getCourseId(java.lang.String courseName) throws blackboard.persist.PersistenceException {
    if (!(courses.containsKey(courseName))) {
        if (!(addIfValidCourse(courseName))) {
            return null;
        }
    }
    return courses.get(courseName).courseId;
}