void encodeAndReply(org.kaaproject.kaa.server.operations.service.akka.messages.io.response.SessionResponse message) {
    try {
        sessionResponseMeter.mark();
        if ((message.getError()) == null) {
            processSessionResponse(message);
        }else {
            processErrors(message.getChannelContext(), message.getErrorBuilder(), message.getError());
        }
    } catch (java.lang.Exception e) {
        processErrors(message.getChannelContext(), message.getErrorBuilder(), e);
    }
}