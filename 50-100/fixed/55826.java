@org.talend.components.azurestorage.table.runtime.Test
public void testGetWriteOperation() {
    assertEquals(ValidationResult.Result.OK, sink.initialize(container, properties).getStatus());
    assertEquals(ValidationResult.Result.OK, sink.validate(container).getStatus());
    org.talend.components.api.component.runtime.WriteOperation<?> writeOperation = sink.createWriteOperation();
    writeOperation.initialize(container);
    writer = ((org.talend.components.azurestorage.table.runtime.AzureStorageTableWriter) (writeOperation.createWriter(container)));
    assertNotNull(writer);
    assertNotNull(writer.getWriteOperation());
}