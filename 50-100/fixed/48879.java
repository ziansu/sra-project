public static mcgill.ca.fragilitysurvey.quiz.questions.Question getQuestionById(int id, final android.content.res.Resources res) {
    java.util.List<mcgill.ca.fragilitysurvey.quiz.questions.Question> questions = new java.util.ArrayList<>();
    questions.addAll(mcgill.ca.fragilitysurvey.quiz.questions.Questions.completeSurveyQuestions(res));
    questions.addAll(mcgill.ca.fragilitysurvey.quiz.questions.Questions.newPatientQuestions(res));
    for (mcgill.ca.fragilitysurvey.quiz.questions.Question question : questions) {
        if ((question.id()) == id) {
            return question;
        }
    }
    return null;
}