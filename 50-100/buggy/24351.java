@java.lang.Override
public com.microsoft.azure.shortcuts.resources.implementation.PublicIpAddressImpl withLeafDomainLabel(java.lang.String dnsName) {
    com.microsoft.azure.management.network.models.PublicIpAddressDnsSettings dnsSettings;
    if (dnsName == null) {
        this.inner().setDnsSettings(null);
        return this;
    }else
        if (null == (dnsSettings = this.inner().getDnsSettings())) {
            dnsSettings = new com.microsoft.azure.management.network.models.PublicIpAddressDnsSettings();
        }
    
    dnsSettings.setDomainNameLabel(dnsName);
    return this;
}