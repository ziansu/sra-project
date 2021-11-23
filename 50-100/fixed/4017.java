private void addResponse(int id, java.util.ArrayList<org.xbmc.kore.testutils.tcpserver.handlers.jsonrpc.JsonResponse> jsonResponses) {
    synchronized(clientResponses) {
        java.util.ArrayList<org.xbmc.kore.testutils.tcpserver.handlers.jsonrpc.JsonResponse> responses = clientResponses.get(java.lang.String.valueOf(id));
        if (responses == null) {
            responses = new java.util.ArrayList<>();
            clientResponses.put(java.lang.String.valueOf(id), responses);
        }
        responses.addAll(jsonResponses);
    }
}