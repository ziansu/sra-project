@java.lang.Override
public void onDnsEvent(java.lang.String hostname, java.lang.String[] ipAddresses, int ipAddressesCount, long timestamp, int uid) {
    if (!(mIsLoggingEnabled.get())) {
        return ;
    }
    android.app.admin.DnsEvent dnsEvent = new android.app.admin.DnsEvent(hostname, ipAddresses, ipAddressesCount, mPm.getNameForUid(uid), timestamp);
    sendNetworkEvent(dnsEvent);
}