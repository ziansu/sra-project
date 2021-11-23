public boolean addCourse(school.Course _course, double _grade) {
    if (!(setCourseOK(_course))) {
        return false;
    }
    if (!(_course.setStudentOK(this))) {
        return false;
    }
    _course.setStudentDoIt(this, _grade);
    setCourseDoIt(_course, _grade);
    return true;
}