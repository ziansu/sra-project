public static java.lang.String uploadInvoiceFileAndGetId(java.lang.Object object, java.lang.String fileName) {
    java.lang.String filePath = com.andressantibanez.sarapp.testing.TestHelper.getAbsouluteFilePathForTestResource(object, fileName);
    com.andressantibanez.sarapp.endpoints.dtos.UploadInvoiceFileResponse uploadInvoiceFileResponse;
    uploadInvoiceFileResponse = com.andressantibanez.sarapp.endpoints.SarappWebService.create().uploadInvoceFile(com.andressantibanez.sarapp.testing.TestHelper.getValidLoginToken(), filePath);
    return uploadInvoiceFileResponse.electronicInvoiceId;
}