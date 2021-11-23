private void sendPing(peersim.core.Node source, peersim.core.Node destination, peersim.core.Node originalSource, int distance, int minPaths, int pid) {
    p2p.deccen.core.transport.RequestMessage rMessage = new p2p.deccen.core.transport.RequestMessage(source, destination, new p2p.deccen.core.transport.StressCentralityPayload(originalSource, null, distance, minPaths));
    p2p.deccen.core.protocols.StressCentralityCD sscd = ((p2p.deccen.core.protocols.StressCentralityCD) (destination.getProtocol(pid)));
    sscd.addRequestMessage(originalSource, rMessage);
}