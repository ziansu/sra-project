private void addCourseToStudent(projectjava.Student a) {
    if ((courseForRoom.size()) != 0) {
        for (projectjava.Course c : courseForRoom) {
            a.addCourse(c);
        }
    }
}