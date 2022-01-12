@java.lang.Override
public void registerStudentToCourse(java.lang.Integer courseId, java.lang.Integer studentId, boolean force) {
    by.triumgroup.recourse.entity.model.Course course = by.triumgroup.recourse.util.RepositoryCallWrapper.wrapJPACall(() -> courseRepository.findOne(courseId));
    by.triumgroup.recourse.entity.model.User user = by.triumgroup.recourse.util.RepositoryCallWrapper.wrapJPACall(() -> userRepository.findOne(studentId));
    validateUserAndCourseToRegisterForCourse(user, course, force);
    java.util.Set<by.triumgroup.recourse.entity.model.User> registeredStudents = course.getStudents();
    registeredStudents.add(user);
    by.triumgroup.recourse.util.RepositoryCallWrapper.wrapJPACall(() -> courseRepository.save(course));
}