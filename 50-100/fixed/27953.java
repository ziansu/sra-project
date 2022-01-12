private short become_leader() {
    if ((node_type) != (com.price.msg_cluster.MsgClusterNode.NodeType.NONE)) {
        com.price.msg_cluster.MsgClusterCmnDef.format_error("This Node[%s] type is NOT NONE", local_ip);
        return MsgClusterCmnDef.RET_FAILURE_INCORRECT_OPERATION;
    }
    short ret = MsgClusterCmnDef.RET_SUCCESS;
    try {
        leader_socket = new java.net.ServerSocket(MsgClusterCmnDef.PORT_NO);
        node_type = com.price.msg_cluster.MsgClusterNode.NodeType.LEADER;
        com.price.msg_cluster.MsgClusterCmnDef.format_info("Node[%s] is a leader !!!", local_ip);
        java.lang.System.out.printf("Node[%s] is a leader !!!\n", local_ip);
    } catch (java.io.IOException e) {
        com.price.msg_cluster.MsgClusterCmnDef.format_debug("Fail to create a server socket, due to: %s", e.toString());
        ret = MsgClusterCmnDef.RET_FAILURE_UNKNOWN;
    }
    return MsgClusterCmnDef.RET_SUCCESS;
}