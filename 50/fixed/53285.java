public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getAllStudentByCourseId(java.lang.String courseId) {
    return courseUtil.findAllStudentWithGradeByCourseId(courseId);
}