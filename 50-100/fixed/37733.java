public com.emc.storageos.model.dr.SiteRestRep map(com.emc.storageos.db.client.model.Site from) {
    if (from == null) {
        return null;
    }
    com.emc.storageos.model.dr.SiteRestRep to = new com.emc.storageos.model.dr.SiteRestRep();
    mapDataObjectFields(from, to);
    to.setUuid(from.getUuid());
    to.setName(from.getName());
    to.setVip(from.getVip());
    to.setHostIPv4AddressMap(from.getHostIPv4AddressMap());
    to.setHostIPv6AddressMap(from.getHostIPv6AddressMap());
    return to;
}