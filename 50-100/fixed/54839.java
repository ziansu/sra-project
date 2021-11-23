@org.junit.Test
public void testOrderImportReport() {
    org.kuali.ole.docstore.common.response.OleNGOrderImportResponse oleNGOrderImportResponse = new org.kuali.ole.docstore.common.response.OleNGOrderImportResponse();
    org.kuali.ole.docstore.common.response.OrderResponse orderResponse = new org.kuali.ole.docstore.common.response.OrderResponse();
    orderResponse.setProcessType(OleNGConstants.BatchProcess.CREATE_REQ_PO);
    org.kuali.ole.docstore.common.response.OrderData orderData = new org.kuali.ole.docstore.common.response.OrderData();
    orderData.setTitle("Test Title");
    orderData.setRecordNumber("1");
    orderData.setSuccessfulMatchPoints("Test MatchPoints");
    orderResponse.addOrderData(orderData);
    oleNGOrderImportResponse.addReqAndPOResponse(orderResponse);
    org.kuali.ole.oleng.batch.reports.BatchOrderImportReportLogHandler batchOrderImportReportLogHandler = org.kuali.ole.oleng.batch.reports.BatchOrderImportReportLogHandler.getInstance();
    batchOrderImportReportLogHandler.logMessage(oleNGOrderImportResponse);
}