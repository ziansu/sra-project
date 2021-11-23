@org.junit.Test
public void getAnswerTest() {
    com.github.solairerove.woodstock.domain.Answer savedAnswer = com.github.solairerove.woodstock.utils.AnswerGenerator.generateAnswer();
    com.github.solairerove.woodstock.domain.Question savedQuestion = com.github.solairerove.woodstock.utils.QuestionGenerator.generateQuestion();
    savedQuestion.getAnswers().add(savedAnswer);
    java.lang.Long questionId = questionRepository.save(savedQuestion).getId();
    java.lang.Long answerId = savedAnswer.getId();
    org.junit.Assert.assertEquals(savedAnswer, answerService.get(questionId, answerId));
}