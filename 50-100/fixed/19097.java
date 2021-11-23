@org.junit.Test
public void testBulkFileWriter() throws java.io.IOException {
    org.talend.components.common.BulkFileProperties bfProperties = ((org.talend.components.common.BulkFileProperties) (new org.talend.components.common.BulkFileProperties("foo").init()));
    java.lang.String filePath = (this.getClass().getResource("").getPath()) + "/test_bulk_1.csv";
    java.lang.System.out.println(("Bulk file path: " + filePath));
    bfProperties.bulkFilePath.setValue(filePath);
    bfProperties.schema.schema.setValue(getMakeRowSchema());
    testWriteFile(bfProperties);
    bfProperties.append.setValue(true);
    testWriteFile(bfProperties);
}