@java.lang.Override
public void initialise(final java.lang.String graphId, final uk.gov.gchq.gaffer.store.schema.Schema schema, final uk.gov.gchq.gaffer.store.StoreProperties properties) throws uk.gov.gchq.gaffer.store.StoreException {
    super.initialise(graphId, schema, properties);
    try {
        fs = org.apache.hadoop.fs.FileSystem.get(new org.apache.hadoop.conf.Configuration());
    } catch (final java.io.IOException e) {
        throw new uk.gov.gchq.gaffer.store.StoreException("Could not connect to the file system", e);
    }
    schemaUtils = new uk.gov.gchq.gaffer.parquetstore.utils.SchemaUtils(getSchema());
    loadIndex();
}