public static boolean checkISO11640(java.lang.String iuv) {
    if ((iuv.length()) <= 4)
        return false;
    
    java.lang.String reference = iuv.substring(4);
    java.lang.String check;
    try {
        check = it.govpay.bd.pagamento.util.IuvUtils.getCheckDigit(reference);
    } catch (org.openspcoop2.generic_project.exception.ServiceException e) {
        return false;
    }
    return iuv.equals((("RF" + check) + reference));
}