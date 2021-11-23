public java.util.List<com.smi.travel.datalayer.view.entity.ReceiptSearchView> getReceiptViewFromFilter(java.lang.String from, java.lang.String to, java.lang.String Department, java.lang.String type, java.lang.String status) {
    return receiptDao.getReceiptViewFromFilter(from, to, Department, type, status);
}