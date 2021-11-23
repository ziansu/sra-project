@java.lang.Override
public java.util.Set<com.navercorp.pinpoint.web.vo.AgentInfo> getAgentsByApplicationName(java.lang.String applicationName, long timestamp) {
    return this.getAgentsByApplicationName(applicationName, timestamp, timestamp);
}