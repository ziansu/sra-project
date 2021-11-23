public void createDemoDataPomodoro() throws java.io.IOException {
    persistLearningOppInst("{'institutionId':'pomodoro.university.it','credits':'5'}", getLearningOppSpec("PU001"), getAcademicTerm(getAcademicYear("2016", "2017"), "Fall"));
    persistLearningOppInst("{'institutionId':'pomodoro.university.it','credits':'7.5'}", getLearningOppSpec("PU002"), getAcademicTerm(getAcademicYear("2016", "2017"), "Spring"));
}