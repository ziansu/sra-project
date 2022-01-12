public void printRefund(com.shtrih.fiscalprinter.PriceItem item) throws java.lang.Exception {
    com.shtrih.fiscalprinter.SMFiscalPrinterImpl.logger.debug("printRefund");
    openFiscalDay();
    java.lang.String text = getRecItemText(item.getText());
    item.setText(text);
    com.shtrih.fiscalprinter.PrintRefund command = new com.shtrih.fiscalprinter.PrintRefund(usrPassword, item);
    execute(command);
}