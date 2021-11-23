short send_msg(java.lang.String src_ip, java.lang.String data) {
    synchronized(buffer_list) {
        buffer_list.add(new com.price.msg_cluster.MsgClusterLeaderSendThread.MsgCfg(src_ip, data));
        notify();
    }
    return MsgClusterCmnDef.RET_SUCCESS;
}