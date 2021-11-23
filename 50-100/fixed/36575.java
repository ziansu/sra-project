@org.springframework.context.annotation.Bean
public org.springframework.data.cassandra.convert.CassandraConverter cassandraConverter() throws java.lang.ClassNotFoundException {
    try {
        org.springframework.data.cassandra.convert.MappingCassandraConverter mappingCassandraConverter = new org.springframework.data.cassandra.convert.MappingCassandraConverter(this.cassandraMapping());
        mappingCassandraConverter.setCustomConversions(this.customConversions());
        return mappingCassandraConverter;
    } catch (java.lang.Exception e) {
        com.konkerlabs.platform.registry.config.CassandraConfig.LOG.error("Fail trying to create the cassandra converters...", e);
    }
    return null;
}