private java.lang.String calcDate(java.util.Date d) {
    java.lang.String res = "";
    if (d != null) {
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        res = dateFormat.format(new java.util.Date());
    }
    return res;
}