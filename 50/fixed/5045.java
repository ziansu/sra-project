qasystem.persistence.entities.Question getQuestionById(java.lang.String id) {
    java.lang.Long lQuestionId = java.lang.Long.parseLong(id);
    return questionRepository.findOne(lQuestionId);
}