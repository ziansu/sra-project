public java.util.List<com.smi.travel.datalayer.view.entity.CreditNoteView> getCreditNoteFromFilter(java.lang.String dateFrom, java.lang.String dateTo, java.lang.String department, java.lang.String status) {
    return this.creditNoteDao.getCreditNoteFromFilter(dateFrom, dateTo, department, status);
}