public teammates.common.datatransfer.FeedbackQuestionAttributes copyFeedbackQuestion(java.lang.String oldCourseId, java.lang.String oldFeedbackSession, java.lang.String feedbackQuestionId, teammates.common.datatransfer.FeedbackSessionAttributes newSession, java.lang.String instructorEmail) throws teammates.common.exception.EntityAlreadyExistsException, teammates.common.exception.EntityDoesNotExistException, teammates.common.exception.InvalidParametersException {
    teammates.common.datatransfer.FeedbackQuestionAttributes question = getFeedbackQuestion(oldFeedbackSession, oldCourseId, feedbackQuestionId);
    question.feedbackSessionName = newSession.getFeedbackSessionName();
    question.courseId = newSession.getCourseId();
    question.creatorEmail = instructorEmail;
    question.questionNumber = -1;
    question.setId("");
    createFeedbackQuestion(newSession, question);
    return question;
}