private short become_follower(java.lang.String server_ip) {
    short ret = MsgClusterCmnDef.RET_SUCCESS;
    try {
        connect_leader(server_ip);
        com.price.msg_cluster.MsgClusterCmnDef.format_info("Node[%s] is a follower", local_ip);
        java.lang.System.out.printf("Node[%s] is a follower !!!\n", local_ip);
    } catch (java.io.IOException e) {
        com.price.msg_cluster.MsgClusterCmnDef.format_debug("Fail to connect to the node[%s], due to: %s", server_ip, e.toString());
        ret = MsgClusterCmnDef.RET_FAILURE_CONNECTION_TRY_TIMEOUT;
    } catch (java.lang.Exception e) {
        com.price.msg_cluster.MsgClusterCmnDef.format_error("Error occur while node[%s] connecting to the remote[%s], due to: %s", local_ip, server_ip, e.toString());
        ret = MsgClusterCmnDef.RET_FAILURE_UNKNOWN;
    }
    return ret;
}