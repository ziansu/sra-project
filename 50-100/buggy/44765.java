private void registerTablespace() throws java.io.IOException {
    net.minidev.json.JSONObject configElements = new net.minidev.json.JSONObject();
    configElements.put(JdbcTablespace.MAPPED_DATABASE_CONFIG_KEY, org.apache.tajo.storage.pgsql.PgSQLTestServer.DATABASE_NAME);
    java.util.Map<java.lang.String, net.minidev.json.JSONObject> configMap = new java.util.HashMap<>();
    configMap.put(TablespaceManager.TABLESPACE_SPEC_CONFIGS_KEY, configElements);
    net.minidev.json.JSONObject config = new net.minidev.json.JSONObject(configMap);
    org.apache.tajo.storage.pgsql.PgSQLTablespace tablespace = new org.apache.tajo.storage.pgsql.PgSQLTablespace(org.apache.tajo.storage.pgsql.PgSQLTestServer.SPACENAME, java.net.URI.create(getJdbcUrlForAdmin()), config);
    tablespace.init(new org.apache.tajo.conf.TajoConf());
    org.apache.tajo.storage.TablespaceManager.addTableSpaceForTest(tablespace);
}