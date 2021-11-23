@org.junit.Before
public void initTest() {
    questionSearchRepository.deleteAll();
    question = new com.innvo.domain.Question();
    question.setQuestion(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_QUESTION);
    question.setMandatory(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_MANDATORY);
    question.setCode(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_CODE);
    question.setPosition(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_POSITION);
    question.setStatus(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_STATUS);
    question.setLastmodifiedby(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_LASTMODIFIEDBY);
    question.setLastmodifieddatetime(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_LASTMODIFIEDDATETIME);
    question.setDomain(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_DOMAIN);
    question.setType(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_TYPE);
    question.setHelp(com.innvo.web.rest.QuestionResourceIntTest.DEFAULT_HELP);
}