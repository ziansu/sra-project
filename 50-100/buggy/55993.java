@org.junit.Test
public void shouldCallMethodWhenAddQuestionToScriptWithMultipleChoice() throws pt.uc.dei.aor.project.business.exception.IllegalAnswerOptionsException, pt.uc.dei.aor.project.business.exception.IllegalQuestionTypeException {
    java.lang.String questionText = "a question text";
    pt.uc.dei.aor.project.business.util.QuestionType questionType = pt.uc.dei.aor.project.business.util.QuestionType.MULTIPLE_CHOICE;
    java.util.List<java.lang.String> options = java.util.Arrays.asList(new java.lang.String[]{ "Manhã" , "Tarde" , "Noite" });
    ejb.addQuestion(iScript, questionText, questionType, options);
    org.mockito.Mockito.verify(iScript).addQuestion(questionText, questionType, options);
}