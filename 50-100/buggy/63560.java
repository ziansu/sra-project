private org.hibernate.tool.hbm2ddl.SchemaExport createSchemaExport(java.lang.Class[] annotatedClasses) {
    final org.hibernate.boot.MetadataSources metadataSources = new org.hibernate.boot.MetadataSources(ssr);
    for (java.lang.Class c : annotatedClasses) {
        metadataSources.addAnnotatedClass(c);
    }
    metadata = ((org.hibernate.boot.spi.MetadataImplementor) (metadataSources.buildMetadata()));
    metadata.validate();
    org.hibernate.tool.hbm2ddl.SchemaExport schemaExport = new org.hibernate.tool.hbm2ddl.SchemaExport();
    schemaExport.setHaltOnError(true).setFormat(false);
    return schemaExport;
}