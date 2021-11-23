public co.tinode.tinodesdk.PromisedReply leave(java.lang.String topicName, boolean unsub) throws java.io.IOException {
    co.tinode.tinodesdk.ClientMessage msg = new co.tinode.tinodesdk.ClientMessage(new co.tinode.tinodesdk.MsgClientLeave());
    msg.leave.id = getNextId();
    msg.leave.topic = topicName;
    msg.leave.unsub = unsub;
    try {
        send(co.tinode.tinodesdk.Tinode.getJsonMapper().writeValueAsString(msg));
        co.tinode.tinodesdk.PromisedReply<co.tinode.tinodesdk.ServerMessage> future = new co.tinode.tinodesdk.PromisedReply();
        mFutures.put(msg.sub.id, future);
        return future;
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        return null;
    }
}