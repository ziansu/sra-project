public org.unidal.dal.jdbc.datasource.JdbcDataSourceDescriptor getDescriptor(java.lang.String id) {
    org.unidal.dal.jdbc.datasource.JdbcDataSourceDescriptor configuration = m_descriptors.get(id);
    if (configuration == null) {
        if (id != null) {
            org.unidal.dal.jdbc.datasource.model.entity.DataSourceDef ds = m_dataSources.findDataSource(id);
            if (ds != null) {
                configuration = getDescriptor(ds);
                m_descriptors.put(id, configuration);
            }
        }
    }
    return configuration;
}