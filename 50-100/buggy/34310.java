@java.lang.Override
public java.util.List<com.twobig.sivale.hd.to.Invoice> getInvoicesBetweenDates(java.util.Date startDate, java.util.Date endDate, java.lang.String cardNumber) {
    final com.twobig.sivale.hadoop.interfaces.InvoiceDAO invoiceDAO = new com.twobig.sivale.hadoop.implementations.HbaseInvoiceImpl();
    final java.lang.String startDateStr = com.twobig.sivale.utils.ParseUtils.parseDate(startDate);
    final java.lang.String endDateStr = com.twobig.sivale.utils.ParseUtils.parseDate(endDate);
    final com.twobig.sivale.hd.to.Invoice invoice = new com.twobig.sivale.hd.to.Invoice();
    invoice.setCard(cardNumber);
    invoice.setIsTicket(CommonsConstants.FLAG_IS_INVOICE);
    java.util.List<com.twobig.sivale.hd.to.Invoice> invoiceList = invoiceDAO.getInvoiceByDateRange(startDateStr, endDateStr, invoice);
    return invoiceList;
}