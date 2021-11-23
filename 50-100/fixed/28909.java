public java.lang.String get() throws java.io.IOException {
    model.Questionnaire ques = quesService.getQuestionnaireById(id);
    model.QuestionnaireQuestions quescontent = quesService.getQuestionnaireQuestionsById(id);
    request().setAttribute("quesinfo", ques);
    request().setAttribute("quescontent", quescontent.getContent());
    return "getbyid";
}