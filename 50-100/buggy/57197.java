private void addBroadcasts(org.atlasapi.media.entity.Item inputItem, org.atlasapi.media.entity.Version version) {
    java.util.Set<org.atlasapi.media.entity.Broadcast> broadcasts = com.google.common.collect.Sets.newHashSet();
    java.util.Set<org.atlasapi.media.entity.Restriction> restrictions = com.google.common.collect.Sets.newHashSet();
    for (org.atlasapi.media.entity.Broadcast broadcast : inputItem.getBroadcasts()) {
        broadcasts.add(broadcastTransformer.transform(broadcast));
        restrictions.add(createRestriction(broadcast));
    }
    version.setBroadcasts(broadcasts);
    setToFirstRestriction(version, restrictions);
}