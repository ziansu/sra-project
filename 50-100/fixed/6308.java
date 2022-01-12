private boolean sendPutRequest(org.cmg.jresp.topology.PointToPoint l, org.cmg.jresp.knowledge.Tuple t) throws java.io.IOException, java.lang.InterruptedException {
    for (org.cmg.jresp.topology.MessageSender p : ports) {
        if (p.canSendTo(l)) {
            int session = getSession();
            org.cmg.jresp.comp.Pending<java.lang.Boolean> pending = new org.cmg.jresp.comp.Pending<java.lang.Boolean>();
            putPending.put(session, pending);
            p.sendPutRequest(l, getName(), session, t);
            return (pending.get()) != null;
        }
    }
    return false;
}