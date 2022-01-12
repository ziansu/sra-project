private java.lang.String generateConnectConference(java.lang.String conferenceId, boolean endOnExit) throws java.lang.RuntimeException {
    com.twilio.sdk.verbs.TwiMLResponse twiMLResponse = new com.twilio.sdk.verbs.TwiMLResponse();
    com.twilio.sdk.verbs.Conference conferenceVerb = new com.twilio.sdk.verbs.Conference(conferenceId);
    conferenceVerb.setStartConferenceOnEnter(true);
    conferenceVerb.setEndConferenceOnExit(endOnExit);
    conferenceVerb.setWaitUrl("/conference/wait");
    try {
        twiMLResponse.append(new com.twilio.sdk.verbs.Dial()).append(conferenceVerb);
    } catch (com.twilio.sdk.verbs.TwiMLException e) {
        e.printStackTrace();
        throw new java.lang.RuntimeException("Error generating conference.");
    }
    return twiMLResponse.toEscapedXML();
}