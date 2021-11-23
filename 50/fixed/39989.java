short check_keepalive() {
    synchronized(buffer_list) {
        buffer_list.addFirst(new com.price.msg_cluster.MsgClusterLeaderSendThread.MsgCfg(null, ((MsgClusterCmnDef.CHECK_KEEPALIVE_TAG) + (MsgClusterCmnDef.END_OF_PACKET))));
        buffer_list.notify();
    }
    return MsgClusterCmnDef.RET_SUCCESS;
}