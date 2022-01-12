@java.lang.Override
public java.lang.String uploadCsvToTableAsyncStart(java.lang.String tableId, java.lang.String fileHandleId, java.lang.String etag, java.lang.Long linesToSkip, org.sagebionetworks.repo.model.table.CsvTableDescriptor csvDescriptor, java.util.List<java.lang.String> columnIds) throws org.sagebionetworks.client.exceptions.SynapseException {
    org.sagebionetworks.repo.model.table.UploadToTableRequest uploadRequest = new org.sagebionetworks.repo.model.table.UploadToTableRequest();
    uploadRequest.setTableId(tableId);
    uploadRequest.setUploadFileHandleId(fileHandleId);
    uploadRequest.setUpdateEtag(etag);
    uploadRequest.setLinesToSkip(linesToSkip);
    uploadRequest.setCsvTableDescriptor(csvDescriptor);
    uploadRequest.setColumnIds(columnIds);
    return startAsynchJob(AsynchJobType.TableCSVUpload, uploadRequest);
}