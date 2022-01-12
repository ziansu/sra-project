private boolean doUpdateHostPassword(final long hostId) {
    if (!(_agentMgr.isAgentAttached(hostId))) {
        return false;
    }
    com.cloud.host.DetailVO nv = _hostDetailsDao.findDetail(hostId, ApiConstants.USERNAME);
    final java.lang.String username = nv.getValue();
    nv = _hostDetailsDao.findDetail(hostId, ApiConstants.PASSWORD);
    final java.lang.String password = nv.getValue();
    final com.cloud.agent.api.UpdateHostPasswordCommand cmd = new com.cloud.agent.api.UpdateHostPasswordCommand(username, password);
    final com.cloud.agent.api.Answer answer = _agentMgr.easySend(hostId, cmd);
    return answer != null;
}