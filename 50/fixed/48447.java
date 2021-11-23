static org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin fromCode(int code) {
    switch (code) {
        case 0 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.IGP;
        case 1 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.EGP;
        case 2 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.INCOMPLETE;
        default :
            throw new java.lang.IllegalArgumentException(("unknown origin code: " + code));
    }
}