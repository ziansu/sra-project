public boolean setSchedule(int projectId, int flowId) {
    connect();
    try {
        com.baifendian.swordfish.rpc.client.RetInfo ret = client.setSchedule(projectId, flowId);
        if ((ret.getStatus()) != 0) {
            com.baifendian.swordfish.rpc.client.MasterClient.logger.error("set schedule error:{}", ret.getMsg());
            return false;
        }
    } catch (org.apache.thrift.TException e) {
        com.baifendian.swordfish.rpc.client.MasterClient.logger.error("set schedule error", e);
        return false;
    } finally {
        close();
    }
    return true;
}