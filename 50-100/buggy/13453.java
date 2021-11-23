@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.opencron.server.domain.Agent agent = ((org.opencron.server.domain.Agent) (o));
    return getAgentId().equals(agent.getAgentId());
}