public static java.lang.String uploadInvoiceFileAndGetId(java.lang.Object object) {
    java.lang.String filePath = com.andressantibanez.sarapp.testing.TestHelper.getAbsouluteFilePathForTestResource(object, "res/test_invoice_file.xml");
    com.andressantibanez.sarapp.endpoints.dtos.UploadInvoiceFileResponse uploadInvoiceFileResponse;
    uploadInvoiceFileResponse = com.andressantibanez.sarapp.endpoints.SarappWebService.create().uploadInvoceFile(com.andressantibanez.sarapp.testing.TestHelper.getValidLoginToken(), filePath);
    return uploadInvoiceFileResponse.electronicInvoiceId;
}