private void get(se.kth.id2203.jbstore.system.network.NetMsg netMsg) {
    rid = (rid) + 1;
    acks.put(rid, 0);
    readlist.put(rid, new java.util.HashMap<>());
    readval.put(rid, ((java.lang.Long) (netMsg.body)));
    reading.put(rid, true);
    reader.put(rid, netMsg.getSource());
    broadcast(NetMsg.READ, rid);
}