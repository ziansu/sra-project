java.util.Collection<qasystem.persistence.entities.Question> findAllByUserId(java.lang.String id) {
    java.lang.Long lUserId = java.lang.Long.parseLong(id);
    return questionRepository.findAllByUserId(lUserId);
}