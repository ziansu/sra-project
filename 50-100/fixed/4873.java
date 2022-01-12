public java.util.Calendar calcDataCobranca(java.lang.String dataCompra) {
    java.util.Calendar cDataCobranca = controller.DataController.stringToCalendar(dataCompra);
    if ((diaVirada) > (diaVencimento)) {
        cDataCobranca.add(java.util.Calendar.MONTH, 1);
    }
    if ((cDataCobranca.get(java.util.Calendar.DAY_OF_MONTH)) >= (diaVirada)) {
        cDataCobranca.add(java.util.Calendar.MONTH, 1);
    }
    cDataCobranca.set(java.util.Calendar.DAY_OF_MONTH, diaVencimento);
    return cDataCobranca;
}