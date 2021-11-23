public static boolean createQuestion(java.lang.String text, java.lang.Integer correctAnswer, testsys.models.Teacher author, java.lang.String options1, java.lang.String options2, java.lang.String options3, java.lang.String options4, java.util.List<testsys.models.Course> courses) {
    return testsys.models.Question.createQuestion(text, correctAnswer, author, courses.get(0).mProfession, options1, options2, options3, options4, courses);
    return true;
}