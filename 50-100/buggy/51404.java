@java.lang.Override
public com.evolveum.polygon.connector.csv.Uid authenticate(com.evolveum.polygon.connector.csv.ObjectClass objectClass, java.lang.String username, org.identityconnectors.common.security.GuardedString password, com.evolveum.polygon.connector.csv.OperationOptions options) {
    com.evolveum.polygon.connector.csv.CsvConnector.LOG.info("Authenticate for {0} with options {1} started", username, options);
    com.evolveum.polygon.connector.csv.Uid uid = resolveUsername(objectClass, username, null, options, false);
    com.evolveum.polygon.connector.csv.CsvConnector.LOG.info("Authenticate for {0} finished, uid {1}", username, uid);
    return uid;
}