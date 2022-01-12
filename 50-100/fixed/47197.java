private void processCancelCallMessage(org.wgs.wamp.WampSocket clientSocket, org.wgs.wamp.type.WampList request) throws java.lang.Exception {
    java.lang.Long callID = request.getLong(1);
    org.wgs.wamp.type.WampDict cancelOptions = ((org.wgs.wamp.type.WampDict) (request.get(2)));
    org.wgs.wamp.rpc.WampCallController call = clientSocket.getCallController(callID);
    if (call != null)
        call.cancel(cancelOptions, null);
    else
        org.wgs.wamp.WampProtocol.sendErrorMessage(clientSocket, WampProtocol.CANCEL_CALL, callID, null, "wamp.error.unknown_call", null, null);
    
}