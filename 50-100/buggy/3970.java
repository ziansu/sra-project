private static java.lang.String convertImportCurrency(java.lang.String value) {
    if ((value == null) || (value.contains("|"))) {
        return value;
    }
    try {
        java.lang.String erg = value.replace(",", "");
        java.lang.Long f = de.aw.database.DBConvert.convertCurrency(java.lang.Double.parseDouble(erg));
        erg = f.toString();
        return erg;
    } catch (java.lang.NumberFormatException e) {
        return value;
    }
}