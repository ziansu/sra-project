public java.lang.String deleteQuestionnaire() {
    model.Questionnaire ques = quesService.getQuestionnaireById(id);
    model.QuestionnaireQuestions quescontent = quesService.getQuestionnaireQuestionsById(id);
    quesService.deleteQuestionnaire(quescontent, ques);
    return null;
}