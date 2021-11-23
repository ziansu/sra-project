public void deleteAnswer(java.lang.String id, java.lang.String aId, java.lang.String uId) {
    java.lang.Long lAnswerId = java.lang.Long.parseLong(aId);
    qasystem.persistence.entities.Answer toDelete = answerRepository.findOne(lAnswerId);
    if (toDelete.isAccepted()) {
        questionService.setQuestionToAnswered(id, false);
    }
    answerRepository.delete(toDelete);
}