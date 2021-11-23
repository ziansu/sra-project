public void validateSubscriberDetailsRequestParams(java.lang.String msisdn, java.lang.String operator, java.lang.String circle, java.lang.String callId) throws org.motechproject.nms.util.helper.DataValidationException {
    org.motechproject.nms.util.helper.ParseDataHelper.validateAndParseString(Constants.CALLING_NUMBER, msisdn, true);
    org.motechproject.nms.util.helper.ParseDataHelper.validateAndParseString(Constants.OPERATOR_CODE, operator, true);
    org.motechproject.nms.util.helper.ParseDataHelper.validateAndParseString(Constants.CIRCLE_CODE, circle, true);
    org.motechproject.nms.util.helper.ParseDataHelper.validateLengthOfCallId(Constants.CALL_ID, org.motechproject.nms.util.helper.ParseDataHelper.validateAndParseString(Constants.CALL_ID, callId, true));
}