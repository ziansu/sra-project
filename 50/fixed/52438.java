public java.lang.String syncStatus(java.lang.Integer terminalId) throws com.comdosoft.financial.timing.service.ServiceException {
    com.comdosoft.financial.timing.domain.zhangfu.Terminal terminal = checkTerminal(terminalId);
    com.comdosoft.financial.timing.joint.JointManager manager = switchManager(terminal.getPayChannelId());
    return manager.syncStatus(terminal, terminalService);
}