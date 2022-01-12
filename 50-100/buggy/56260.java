@java.lang.Override
public java.lang.String storeProperties(org.talend.components.snowflake.test.Properties properties, java.lang.String name, java.lang.String repositoryLocation, java.lang.String schemaPropertyName) {
    org.talend.components.snowflake.test.SnowflakeTestIT.RepoProps rp = new org.talend.components.snowflake.test.SnowflakeTestIT.RepoProps(properties, name, repositoryLocation, schemaPropertyName);
    repoProps.add(rp);
    org.talend.components.snowflake.test.SnowflakeTestIT.LOGGER.debug(rp.toString());
    return repositoryLocation + (++(locationNum));
}