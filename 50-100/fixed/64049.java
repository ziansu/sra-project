private java.util.Date parseDate(java.lang.String date) {
    try {
        if ((date != null) && (date.matches("\\d\\d.\\d\\d.\\d\\d\\d\\d"))) {
            return new java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.GERMAN).parse(date);
        }else
            if ((date != null) && (date.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d"))) {
                return new java.text.SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH).parse(date);
            }else {
                return null;
            }
        
    } catch (java.text.ParseException e) {
        return null;
    }
}