private com.comcast.cdn.traffic_control.traffic_router.core.dns.ZoneKey generateZoneKey(final org.xbill.DNS.Name name, final java.util.List<org.xbill.DNS.Record> list, final boolean dynamicRequest, final boolean dnssecRequest) {
    if (dynamicRequest && (!dnssecRequest)) {
        return new com.comcast.cdn.traffic_control.traffic_router.core.dns.ZoneKey(name, list);
    }else
        if ((isDnssecEnabled()) && (name.subdomain(com.comcast.cdn.traffic_control.traffic_router.core.dns.ZoneManager.getTopLevelDomain()))) {
            return new com.comcast.cdn.traffic_control.traffic_router.core.dns.SignedZoneKey(name, list);
        }else {
            return new com.comcast.cdn.traffic_control.traffic_router.core.dns.ZoneKey(name, list);
        }
    
}