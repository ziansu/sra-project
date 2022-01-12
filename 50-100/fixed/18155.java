private static org.diirt.datasource.CompositeDataSourceConfiguration readConfiguration(org.diirt.datasource.CompositeDataSource dataSource, java.lang.String confPath) {
    try (java.io.InputStream input = org.diirt.util.config.Configuration.getFileAsStream((confPath + "/datasources.xml"), dataSource, "datasources.default.xml")) {
        org.diirt.datasource.CompositeDataSourceConfiguration conf = new org.diirt.datasource.CompositeDataSourceConfiguration(input);
        return conf;
    } catch (java.lang.Exception ex) {
        java.util.logging.Logger.getLogger(org.diirt.datasource.CompositeDataSourceConfiguration.class.getName()).log(java.util.logging.Level.SEVERE, (("Couldn't load DIIRT_HOME/" + confPath) + "/datasources.xml"), ex);
        return new org.diirt.datasource.CompositeDataSourceConfiguration();
    }
}