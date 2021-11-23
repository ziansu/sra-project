@java.lang.Override
public void run() {
    short ret = MsgClusterCmnDef.RET_SUCCESS;
    synchronized(runtime_ret) {
        try {
            wait();
            com.price.msg_cluster.MsgClusterCmnDef.debug("Notify the parent it's time to leave......");
            ret = deinitialize();
        } catch (java.lang.InterruptedException e) {
            com.price.msg_cluster.MsgClusterCmnDef.error("An interrupted exception occur while waiting for cluster's death");
        }
        runtime_ret.set(ret);
    }
}