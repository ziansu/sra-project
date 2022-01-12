public void onPlay(com.wowza.wms.stream.IMediaStream stream, java.lang.String streamName, double playStart, double playLen, int playReset) {
    if (!(ticketChecker.checkTicket(stream, stream.getClient()))) {
        stream.getClient().rejectConnection("Streaming not allowed");
        stream.sendStreamNotFound("Streaming not allowed");
        stream.getClient().setShutdownClient(true);
        stream.getClient().shutdownClient();
    }
}