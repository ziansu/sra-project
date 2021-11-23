public static final java.util.Date convertStringToDate(java.lang.String aMask, java.lang.String strDate) {
    if ((strDate != null) && ((strDate.trim().length()) != 0)) {
        com.google.gwt.i18n.client.DateTimeFormat df = com.google.gwt.i18n.client.DateTimeFormat.getFormat(aMask);
        return df.parse(strDate);
    }
    return null;
}