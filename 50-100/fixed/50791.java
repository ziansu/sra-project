@java.lang.Override
public java.io.Closeable getConnection() {
    java.lang.String address = java.lang.String.format("%s %s", propertiesRepository.read(org.kontext.common.repositories.PropertiesRepositoryConstants.cassandra_url), propertiesRepository.read(org.kontext.common.repositories.PropertiesRepositoryConstants.cassandra_port));
    com.datastax.driver.core.Cluster cluster = com.datastax.driver.core.Cluster.builder().addContactPoint(address).build();
    return cluster.connect();
}