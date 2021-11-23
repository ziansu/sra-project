public final void actionResult(apiaryparty.Network net) {
    this.net = net;
    capturedNodes = net.getCapturedNodes();
    availableNodes = net.getAvailableNodes();
    result(net.getNode(lastNodeID));
}