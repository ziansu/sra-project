@java.lang.Override
public org.keycloak.authorization.store.StoreFactory create(org.keycloak.models.KeycloakSession session) {
    org.keycloak.connections.mongo.MongoConnectionProvider connection = session.getProvider(org.keycloak.connections.mongo.MongoConnectionProvider.class);
    org.keycloak.authorization.AuthorizationProvider provider = session.getProvider(org.keycloak.authorization.AuthorizationProvider.class);
    return new org.keycloak.authorization.mongo.store.MongoStoreFactory(connection.getInvocationContext(), provider);
}