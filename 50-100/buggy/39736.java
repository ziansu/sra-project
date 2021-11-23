@java.lang.Override
public synchronized void update(br.cefetmg.jquest.model.domain.Question question) throws br.cefetmg.jquest.model.exception.PersistenceException {
    if (question == null) {
        throw new br.cefetmg.jquest.model.exception.PersistenceException("Question cannot be null");
    }
    java.lang.Long questionId = question.getId();
    if (questionId == null) {
        throw new br.cefetmg.jquest.model.exception.PersistenceException("Entity Id cannot be null");
    }
    if (br.cefetmg.jquest.model.dao.QuestionDAOImpl.questionDB.containsKey(questionId)) {
        throw new br.cefetmg.jquest.model.exception.PersistenceException((("Question with id " + (question.getId())) + " is not persisted"));
    }
    br.cefetmg.jquest.model.dao.QuestionDAOImpl.questionDB.replace(questionId, question);
}