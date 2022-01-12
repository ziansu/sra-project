@java.lang.Override
public void broadcast(lk.ac.mrt.distributed.api.Broadcastable broadcastable, java.util.Set<lk.ac.mrt.distributed.api.Node> neighbours) throws lk.ac.mrt.distributed.api.exceptions.CommunicationException {
    lk.ac.mrt.distributed.api.Broadcastable oldBroadcastable = broadcastableCache.get(broadcastable.getMessageId());
    if ((oldBroadcastable == null) || (!(oldBroadcastable.isBroadcasted()))) {
        for (lk.ac.mrt.distributed.api.Node n : neighbours) {
            this.send(n, broadcastable);
        }
        broadcastable.setBroadcasted();
        broadcastableCache.put(broadcastable.getMessageId(), broadcastable);
    }
}