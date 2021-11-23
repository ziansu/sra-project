public void flush(boolean error) {
    if (isFlush) {
        throw new java.lang.IllegalStateException("context already flushed");
    }
    isFlush = true;
    if ((!(isDisableResponse)) && (!error)) {
        jazmin.server.msg.codec.ResponseMessage rspMessage = new jazmin.server.msg.codec.ResponseMessage();
        rspMessage.requestId = requestMessage.requestId;
        rspMessage.responseObject = responseObject;
        rspMessage.serviceId = requestMessage.serviceId;
        if ((rawData) != null) {
            rspMessage.rawData = rawData;
        }
        session.sendMessage(rspMessage);
    }
}