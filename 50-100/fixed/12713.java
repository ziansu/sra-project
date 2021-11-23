private void handleCancelRequest(android.javax.sip.message.Request request, android.javax.sip.ServerTransaction serverTransaction) {
    android.javax.sip.header.CallIdHeader callIdHeader = ((android.javax.sip.header.CallIdHeader) (request.getHeader(CallIdHeader.NAME)));
    java.lang.String callId = callIdHeader.getCallId();
    if ((doSendResponse(Response.OK, RequestMethod.CANCEL, request, serverTransaction)) != null) {
        bus.post(new org.github.sipuada.events.CallInvitationCanceled(("Call invitation canceled by the caller " + "or callee took longer than roughly 30 seconds to answer."), callId, true));
        return ;
    }
    throw new org.github.sipuada.exceptions.RequestCouldNotBeAddressed();
}