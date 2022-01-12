public java.lang.String[] getHostList(java.lang.String service) {
    java.util.ArrayList<java.lang.String> hostlist = new java.util.ArrayList<java.lang.String>();
    for (javax.jmdns.JmDNS server : jmri.util.zeroconf.ZeroConfService.netServices().values()) {
        javax.jmdns.ServiceInfo[] infos = server.list(service);
        for (javax.jmdns.ServiceInfo info : infos) {
            hostlist.add(info.getServer());
        }
    }
    return ((java.lang.String[]) (hostlist.toArray()));
}