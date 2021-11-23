private void put(se.kth.id2203.jbstore.system.network.NetMsg netMsg) {
    writer = netMsg.getSource();
    java.io.Serializable v = netMsg.body;
    rid = (rid) + 1;
    wts = (wts) + 1;
    acks.put(rid, 0);
    broadcast(NetMsg.WRITE, org.apache.commons.lang3.tuple.Triple.of(rid, wts, v));
}