void setQuestionToAnswered(java.lang.String id, boolean answered) {
    java.lang.Long lQuestionId = java.lang.Long.parseLong(id);
    questionRepository.updateAnswered(lQuestionId, answered);
}