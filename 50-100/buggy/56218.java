@java.lang.Override
public int compareTo(org.opendaylight.monitor.provider.packetHandler.utils.TraceElement traceElement) {
    org.opendaylight.monitor.provider.packetHandler.utils.TraceElement p1 = traceElement;
    org.opendaylight.monitor.provider.packetHandler.utils.TraceElement p2 = this;
    int ret = -1;
    if ((p1.ttl) == (p2.ttl)) {
        ret = 0;
    }else
        if ((p1.ttl) > (p2.ttl)) {
            ret = 1;
        }else
            if ((p1.ttl) < (p2.ttl)) {
                ret = -1;
            }
        
    
    return ret;
}