public java.lang.String addAnswerToMap(com.discussion.portal.model.Answer answer) {
    com.discussion.portal.mongodb.model.DbUser user = getUserByUserId(answer.getAnsweredBy());
    java.util.Map<java.lang.String, java.lang.String> userAnswerMap = user.getUserAnswerMap();
    if (userAnswerMap.containsKey(answer.getQuestionId())) {
        return com.discussion.portal.common.Constants.StatusCode.DUPLICATE;
    }
    user.addAnswerToMap(answer.getQuestionId(), answer.getAnswerId());
    userRepository.save(user);
    return com.discussion.portal.common.Constants.StatusCode.SUCCESS;
}