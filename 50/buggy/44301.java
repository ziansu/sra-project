public void createFeedbackQuestionNoIntegrityCheck(teammates.common.datatransfer.FeedbackSessionAttributes fsa, teammates.common.datatransfer.FeedbackQuestionAttributes fqa, int questionNumber) throws teammates.common.exception.EntityAlreadyExistsException, teammates.common.exception.EntityDoesNotExistException, teammates.common.exception.InvalidParametersException {
    fqa.questionNumber = questionNumber;
    fqa.removeIrrelevantVisibilityOptions();
    teammates.logic.core.FeedbackQuestionsLogic.fqDb.createFeedbackQuestion(fsa, fqa);
}