@java.lang.Override
public java.lang.String service() {
    com.hazelcast.core.IdGenerator idgen = Hazelcast.INSTANCE.getIdGenerator("CLIENT_ID_GENERATOR");
    java.lang.String clientId = null;
    while (clientId != null) {
        clientId = java.lang.String.format("laniClientId%011d", idgen.newId());
        if ((Session.NEXUS.get(clientId)) != null) {
            clientId = null;
        }
    } 
    return java.lang.String.format("{\"id\":\"%s\"}", clientId);
}