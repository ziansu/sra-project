private boolean validateInvoiceNumber(org.kuali.ole.pojo.OleInvoiceRecord oleInvoiceRecord, org.kuali.ole.Exchange exchange, java.lang.Integer recordIndex) {
    java.lang.String invoiceNumber = oleInvoiceRecord.getInvoiceNumber();
    if ((org.apache.commons.lang3.StringUtils.isBlank(invoiceNumber)) || (!(org.apache.commons.lang3.math.NumberUtils.isDigits(invoiceNumber)))) {
        getBatchUtil().addOrderFaiureResponseToExchange(new org.kuali.ole.oleng.exception.ValidationException("Invoice number cannot be blank or null and it should be round number"), recordIndex, exchange);
        return false;
    }
    return true;
}