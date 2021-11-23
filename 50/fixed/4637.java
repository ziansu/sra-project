public void isConnected(fc.FCDynamicGraph.Request request) {
    request.isConnected = forest[0].isConnected(request.u, request.v);
    request.status = fc.FCDynamicGraph.FINISHED;
}