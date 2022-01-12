@java.lang.Override
public void process(gov.va.escreening.measure.AnswerSubmission submission, java.lang.Integer rowId) {
    if ((submission.getAnswerType()) == (Answer.Type.OTHER)) {
        gov.va.escreening.dto.ae.Answer answer = submission.getUserAnswer(submission.getAnswerId(), rowId);
        if (answer != null) {
            java.lang.String otherResponse = org.apache.commons.lang3.StringUtils.left(answer.getOtherAnswerResponse(), 1000);
            submission.getSurveyMeasureResponse().setOtherValue(otherResponse);
        }
    }
    processNext(submission, rowId);
}