@java.lang.Override
public java.util.List<com.twobig.sivale.beans.InvoiceAuxBean> getSugguestedInvoices(com.twobig.sivale.hd.to.Transaction transaction) {
    final com.twobig.sivale.hadoop.interfaces.InvoiceDAO invoiceDAO = new com.twobig.sivale.hadoop.implementations.HbaseInvoiceImpl();
    final com.twobig.sivale.hd.to.Invoice invoice = new com.twobig.sivale.hd.to.Invoice();
    invoice.setCard(transaction.getCardNumber());
    invoice.setTransactionId(CommonsConstants.DEFAULT_EMPTY_TRANSACTION_ID);
    java.util.List<com.twobig.sivale.hd.to.Invoice> invoiceList = invoiceDAO.getInvoiceByFilters(invoice);
    java.util.List<com.twobig.sivale.beans.InvoiceAuxBean> resultList = validateIsSuggestInvoice(transaction, invoiceList);
    return resultList;
}