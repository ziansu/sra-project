public java.util.Calendar calcDataCobranca(java.util.Calendar dataCompra) {
    java.util.Calendar dataCobranca = java.util.Calendar.getInstance();
    dataCobranca.setTime(dataCompra.getTime());
    if ((dataCobranca.get(java.util.Calendar.DAY_OF_MONTH)) >= (diaVirada)) {
        dataCobranca.add(java.util.Calendar.MONTH, 1);
    }
    dataCobranca.set(java.util.Calendar.DAY_OF_MONTH, diaVencimento);
    return dataCobranca;
}