private teammates.common.datatransfer.attributes.FeedbackSessionAttributes setEmail(teammates.common.datatransfer.attributes.FeedbackSessionAttributes newSession) {
    java.lang.String[] sendReminderEmailsArray = getRequestParamValues(Const.ParamsNames.FEEDBACK_SESSION_SENDREMINDEREMAIL);
    java.util.List<java.lang.String> sendReminderEmailsList = (sendReminderEmailsArray == null) ? new java.util.ArrayList<java.lang.String>() : java.util.Arrays.asList(sendReminderEmailsArray);
    newSession.setClosingEmailEnabled(sendReminderEmailsList.contains(EmailType.FEEDBACK_CLOSING.toString()));
    newSession.setPublishedEmailEnabled(sendReminderEmailsList.contains(EmailType.FEEDBACK_PUBLISHED.toString()));
    newSession = extractFeedbackSessionDataHelper(newSession, sendReminderEmailsList);
    return newSession;
}