private void handleByeRequest(android.javax.sip.message.Request request, android.javax.sip.ServerTransaction serverTransaction) {
    android.javax.sip.header.CallIdHeader callIdHeader = ((android.javax.sip.header.CallIdHeader) (request.getHeader(CallIdHeader.NAME)));
    java.lang.String callId = callIdHeader.getCallId();
    if ((doSendResponse(Response.OK, RequestMethod.BYE, request, serverTransaction)) != null) {
        bus.post(new org.github.sipuada.events.EstablishedCallFinished(callId));
        return ;
    }
    throw new org.github.sipuada.exceptions.RequestCouldNotBeAddressed();
}