private teammates.ui.template.FeedbackResultsQuestionDetails createQuestionDetails(int questionIndex, teammates.common.datatransfer.FeedbackQuestionAttributes question, teammates.common.datatransfer.FeedbackQuestionDetails questionDetailsBundle, java.util.List<teammates.common.datatransfer.FeedbackResponseAttributes> responsesBundle) {
    java.lang.String questionText = questionDetailsBundle.questionText;
    java.lang.String additionalInfo = questionDetailsBundle.getQuestionAdditionalInfoHtml(questionIndex, "");
    java.lang.String studentEmail = ((student) == null) ? null : student.email;
    java.lang.String questionResultStatistics = questionDetailsBundle.getQuestionResultStatisticsHtml(responsesBundle, question, studentEmail, bundle, "student");
    boolean isIndividualResponsesShownToStudents = questionDetailsBundle.isIndividualResponsesShownToStudents();
    questionResultStatistics(isIndividualResponsesShownToStudents);
    return new teammates.ui.template.FeedbackResultsQuestionDetails(java.lang.Integer.toString(questionIndex), questionText, additionalInfo);
}