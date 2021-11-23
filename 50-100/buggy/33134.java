public void endAudio() throws java.io.IOException, java.lang.ClassNotFoundException, javax.sound.sampled.LineUnavailableException {
    running = false;
    for (ch.uzh.csg.p2p.model.User receiver : receiverList) {
        ch.uzh.csg.p2p.model.request.AudioRequest request = new ch.uzh.csg.p2p.model.request.AudioRequest(ch.uzh.csg.p2p.model.request.RequestType.SEND, ch.uzh.csg.p2p.model.request.RequestStatus.ABORTED, receiver.getUsername(), sender.getUsername());
        ch.uzh.csg.p2p.model.request.RequestHandler.handleRequest(request, node);
    }
}