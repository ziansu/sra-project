public com.hazelcast.cluster.impl.JoinRequest createJoinRequest(boolean withCredentials) {
    final com.hazelcast.security.Credentials credentials = (withCredentials && ((securityContext) != null)) ? securityContext.getCredentialsFactory().newCredentials() : null;
    return new com.hazelcast.cluster.impl.JoinRequest(com.hazelcast.nio.Packet.VERSION, buildInfo.getBuildNumber(), address, localMember.getUuid(), localMember.isLiteMember(), createConfigCheck(), credentials, localMember.getAttributes());
}