private java.lang.String getSaveResponseRedirect(javax.servlet.http.HttpSession session) throws java.lang.Exception {
    java.lang.String saveURL = "/save_response?qid=" + (getQuestionIdFromSession(session));
    return com.twilio.survey.util.TwiMLUtil.redirectPost(saveURL);
}