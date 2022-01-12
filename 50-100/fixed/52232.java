public void deleteCourse(java.lang.String courseName) {
    for (Course c : courses) {
        if ((c.getCourseName().equals(courseName)) && ((c.getQuizs().size()) <= 0)) {
            courses.remove(c);
            Database.deleteCourse(courseName);
            break;
        }
    }
}