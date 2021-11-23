public boolean sendRejectResponse(org.github.sipuada.Constants.RequestMethod method, android.javax.sip.message.Request request, android.javax.sip.ServerTransaction serverTransaction) {
    android.javax.sip.header.CallIdHeader callIdHeader = ((android.javax.sip.header.CallIdHeader) (request.getHeader(CallIdHeader.NAME)));
    java.lang.String callId = callIdHeader.getCallId();
    if ((doSendResponse(Response.BUSY_HERE, method, request, serverTransaction)) != null) {
        bus.post(new org.github.sipuada.events.CallInvitationCanceled(("Call invitation rejected by the callee or callee" + " is currently busy and couldn't take another call."), callId, false));
        return true;
    }
    return false;
}