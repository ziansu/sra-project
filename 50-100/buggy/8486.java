static void updateChannelsPositionsInMember(com.hazelcast.core.Member member, java.util.Map<java.lang.Short, java.lang.Long> update) {
    java.util.Map<java.lang.Short, java.lang.Long> positions = eu.modernmt.cluster.NodeInfo.fromString(member.getStringAttribute(eu.modernmt.cluster.NodeInfo.DATA_CHANNELS_ATTRIBUTE));
    for (java.util.Map.Entry<java.lang.Short, java.lang.Long> position : update.entrySet()) {
        positions.put(position.getKey(), position.getValue());
    }
    member.setStringAttribute(eu.modernmt.cluster.NodeInfo.DATA_CHANNELS_ATTRIBUTE, eu.modernmt.cluster.NodeInfo.toString(positions));
}