public net.doubledoordev.backend.server.query.QueryResponse basicStat() {
    try {
        handshake();
        net.doubledoordev.backend.server.query.QueryRequest req = new net.doubledoordev.backend.server.query.QueryRequest();
        req.type = net.doubledoordev.backend.server.query.MCQuery.STAT;
        req.sessionID = generateSessionID();
        req.setPayload(token);
        byte[] send = req.toBytes();
        byte[] result = sendUDP(send);
        net.doubledoordev.backend.server.query.QueryResponse res = new net.doubledoordev.backend.server.query.QueryResponse(result, false);
        return res;
    } catch (net.doubledoordev.backend.util.exceptions.ServerOfflineException e) {
        return null;
    }
}