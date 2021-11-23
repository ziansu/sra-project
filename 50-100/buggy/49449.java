@org.junit.Test
public void should_persist_and_read() throws java.lang.Exception {
    com.conference.spring.test.webassistant.persistence.QuestionEntity questionEntity = com.conference.spring.test.webassistant.persistence.QuestionEntity.builder().text("question?").build();
    questionEntity = entityManager.persist(questionEntity);
    com.conference.spring.test.webassistant.persistence.AnswerEntity persist = entityManager.persist(com.conference.spring.test.webassistant.persistence.AnswerEntity.builder().text("answer").question(questionEntity).build());
    org.junit.Assert.assertNotNull(repository.findOne(persist.getId()));
    org.junit.Assert.assertNotNull(questionRepository.findOne(questionEntity.getId()));
}