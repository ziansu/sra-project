public net.vicp.lylab.core.model.Message callRpcServer(net.vicp.lylab.core.model.RPCMessage message) {
    if (closed.get())
        throw new net.vicp.lylab.core.exceptions.LYException("Client closed, did you initialize() Caller?");
    
    net.vicp.lylab.utils.internet.SyncSession session = pool.accessOne();
    byte[] req;
    byte[] res;
    req = protocol.encode(message);
    session.send(req);
    res = session.receive().getLeft();
    net.vicp.lylab.core.model.Message msg = ((net.vicp.lylab.core.model.Message) (protocol.decode(res)));
    pool.recycle(session);
    return msg;
}