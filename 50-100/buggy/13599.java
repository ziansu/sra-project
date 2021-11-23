public void setCourse(Course course) {
    currentCourse = course;
    java.lang.String quizName = ((java.lang.String) (javax.swing.JOptionPane.showInputDialog(this, "New Quiz", "Quiz Name", javax.swing.JOptionPane.PLAIN_MESSAGE)));
    if ((quizName != null) || ((quizName.length()) > 0)) {
        tmpQuiz = course.tempQuiz = new Quiz(quizName);
    }else {
        app.mainMenu();
    }
}