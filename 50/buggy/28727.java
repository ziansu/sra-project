@org.junit.Before
public void setupIndex() throws java.lang.Exception {
    org.nuxeo.elasticsearch.LogEntryGen.flushAndSync();
    esa.initIndexes(true);
}