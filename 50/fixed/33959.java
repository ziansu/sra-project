public static final boolean validParameters1Number(java.lang.String[] parameters) {
    return (parameters != null) && (org.talend.dataquality.datamasking.functions.CharactersOperationUtils.factorise(parameters, 1, org.talend.dataquality.datamasking.functions.CharactersOperationUtils.patternNumber));
}