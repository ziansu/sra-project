@java.lang.Override
public java.lang.String call() {
    java.lang.String userRegistrationId = com.hazelcast.util.UuidUtil.newUnsecureUuidString();
    com.hazelcast.client.spi.impl.listener.ClientRegistrationKey registrationKey = new com.hazelcast.client.spi.impl.listener.ClientRegistrationKey(userRegistrationId, handler, codec);
    registrations.put(registrationKey, new java.util.concurrent.ConcurrentHashMap<com.hazelcast.nio.Address, com.hazelcast.client.spi.impl.listener.ClientEventRegistration>());
    try {
        for (com.hazelcast.core.Member member : members) {
            invoke(registrationKey, member.getAddress());
        }
    } catch (java.lang.Exception e) {
        deregisterListener(userRegistrationId);
        throw new com.hazelcast.core.HazelcastException("Listener can not be added", e);
    }
    return userRegistrationId;
}