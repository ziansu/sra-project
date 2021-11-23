public void drop(edu.macalester.registrar.Course course) {
    course.drop(this);
    courses.remove(course);
}