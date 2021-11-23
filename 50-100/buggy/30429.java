public static coen390.nicholas.savedataapp.Course generateRandomCourse() {
    java.util.Random rnd = new java.util.Random();
    int assignmentNo = (rnd.nextInt(5)) + 1;
    java.util.ArrayList<coen390.nicholas.savedataapp.assignmentToDo> tempAssns = new java.util.ArrayList<coen390.nicholas.savedataapp.assignmentToDo>();
    for (int i = 0; i < assignmentNo; i++) {
        tempAssns.add(assignmentToDo.generateRandomAssignment());
    }
    (coen390.nicholas.savedataapp.Course.nmbCourses)++;
    return new coen390.nicholas.savedataapp.Course(("Course " + (coen390.nicholas.savedataapp.Course.courseID)), tempAssns);
}