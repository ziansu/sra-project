public void acceptAnswer(java.lang.String id, java.lang.String aId) {
    questionService.setQuestionToAnswered(id, true);
    java.lang.Long lAnswerId = java.lang.Long.parseLong(aId);
    answerRepository.updateAccepted(lAnswerId, true);
}