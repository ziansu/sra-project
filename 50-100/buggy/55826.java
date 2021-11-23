@org.junit.Test
public void testGetWriteOperation() {
    org.junit.Assert.assertEquals(ValidationResult.Result.OK, sink.initialize(container, properties).getStatus());
    org.junit.Assert.assertEquals(ValidationResult.Result.OK, sink.validate(container).getStatus());
    org.talend.components.api.component.runtime.WriteOperation<?> writeOperation = sink.createWriteOperation();
    writeOperation.initialize(container);
    writer = ((org.talend.components.azurestorage.table.runtime.AzureStorageTableWriter) (writeOperation.createWriter(container)));
    org.junit.Assert.assertNotNull(writer);
    org.junit.Assert.assertNotNull(writer.getWriteOperation());
}