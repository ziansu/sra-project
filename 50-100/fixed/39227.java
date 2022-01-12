@java.lang.SuppressWarnings(value = "unused")
private void invoiceValidation(java.math.BigDecimal paymentAmt, java.math.BigDecimal invoiceAmt, java.math.BigDecimal whtAmt) throws java.lang.Exception {
    if (paymentAmt.equals(invoiceAmt.subtract(whtAmt)))
        return ;
    else {
        throw new java.lang.Exception(((((("ERROR ==> Payment Amount not equal to Invoice Amount minus WHT Amount: " + paymentAmt) + " != ") + invoiceAmt) + " - ") + whtAmt));
    }
}