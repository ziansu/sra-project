@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.opennms.netmgt.poller.client.rpc.PollerResponseDTO other = ((org.opennms.netmgt.poller.client.rpc.PollerResponseDTO) (obj));
    return (java.util.Objects.equals(this.failureMesage, other.failureMesage)) && (java.util.Objects.equals(this.pollStatus, other.pollStatus));
}