static org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin fromCode(int code) {
    switch (code) {
        case 1 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.IGP;
        case 2 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.EGP;
        case 3 :
            return org.bgp4j.netty.protocol.update.OriginPathAttribute.Origin.INCOMPLETE;
        default :
            throw new java.lang.IllegalArgumentException(("unknown origin code: " + code));
    }
}