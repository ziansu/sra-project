private boolean isAgentRunning(com.navercorp.pinpoint.web.applicationmap.AgentInfo agentInfo) {
    if ((agentInfo.getStatus()) != null) {
        return (agentInfo.getStatus().getState()) == (com.navercorp.pinpoint.common.util.AgentLifeCycleState.RUNNING);
    }else {
        return false;
    }
}