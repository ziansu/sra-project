private void populateBillingDetails() {
    billingDetailData.setDocDate(getDocumentSelectedDate());
    billingDetailData.setDocNo(getDocumentSelectedNo());
    billingDetailData.setPages(countPhotoClick);
    billingDetailData.setDocType(selectedDocumentType);
    billingDetailData.setDocrefId(getGenereratedRefID());
    billingDetailData.setUploadBy(getVendorName());
    billingDetailData.setUploadDate(getDocumentSelectedDate());
}