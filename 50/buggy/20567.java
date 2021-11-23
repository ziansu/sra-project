@java.lang.Override
public java.lang.Boolean isVmAlive(com.cloud.ha.VirtualMachine vm, com.cloud.host.Host host) {
    com.cloud.host.Status status = isAgentAlive(host);
    if (status == null) {
        return false;
    }
    return status == (com.cloud.host.Status.Up) ? true : false;
}