private java.util.Calendar calculateSignatureExpiration(final long baseTimeInMillis, final java.util.List<org.xbill.DNS.Record> records, final java.util.List<? extends com.verisignlabs.dnssec.security.DnsKeyPair> kskPairs, final java.util.List<? extends com.verisignlabs.dnssec.security.DnsKeyPair> zskPairs) {
    final java.util.Calendar expiration = java.util.Calendar.getInstance();
    final long maxTTL = (com.comcast.cdn.traffic_control.traffic_router.core.dns.ZoneUtils.getMaximumTTL(records)) * 1000;
    final long signatureExpiration = baseTimeInMillis + (maxTTL * (getExpirationMultiplier()));
    expiration.setTimeInMillis(signatureExpiration);
    return expiration;
}