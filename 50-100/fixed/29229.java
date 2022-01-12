@org.junit.Before
public void setUp() throws java.lang.Exception {
    props = new org.talend.components.marketo.tmarketobulkexec.TMarketoBulkExecProperties("tests");
    props.setupProperties();
    props.connection.setupProperties();
    props.connection.setupLayout();
    props.schemaInput.setupLayout();
    props.setupLayout();
    props.partitionName.setValue("");
    props.customObjectName.setValue("");
    props.bulkFilePath.setValue("");
    props.logDownloadPath.setValue("");
}