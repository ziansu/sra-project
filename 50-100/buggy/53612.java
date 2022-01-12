protected java.util.Collection<java.lang.String> getWwnsInZone(com.emc.storageos.networkcontroller.impl.mds.Zone zone) {
    java.util.Set<java.lang.String> col = com.google.common.collect.Sets.newHashSet();
    if ((zone.getMembers()) != null) {
        for (com.emc.storageos.networkcontroller.impl.mds.ZoneMember member : zone.getMembers()) {
            if ((!(org.apache.commons.lang.StringUtils.isEmpty(member.getAddress()))) && (!(member.isAliasType()))) {
                col.add(member.getAddress());
            }
        }
    }
    return col;
}