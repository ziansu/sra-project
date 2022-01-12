private short find_leader() {
    short ret = MsgClusterCmnDef.RET_SUCCESS;
    OUT : for (int i = 0; i < (com.price.msg_cluster.MsgClusterFollowerNode.TRY_TIMES); i++) {
        for (java.lang.String server_ip : server_list) {
            if ((local_ip) == server_ip)
                continue;
            
            ret = become_follower(server_ip);
            if (com.price.msg_cluster.MsgClusterCmnDef.CheckSuccess(ret))
                break OUT;
            else {
                if (!(com.price.msg_cluster.MsgClusterCmnDef.IsTryConnectionTimeout(ret)))
                    break OUT;
                
            }
        }
    }
    return ret;
}