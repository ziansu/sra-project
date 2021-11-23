public java.lang.String update() {
    model.Questionnaire ques = quesService.getQuestionnaireById(id);
    ques.setEndTime(endTime);
    ques.setIsPublic(isPublic);
    ques.setReleaseTime(releaseTime);
    ques.setStatus(status);
    ques.setTitle(title);
    model.QuestionnaireQuestions quescontent = quesService.getQuestionnaireQuestionsById(id);
    quescontent.setContent(content);
    quesService.updateQuestionnaire(quescontent, ques);
    return null;
}