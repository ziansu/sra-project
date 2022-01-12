public java.lang.String getDate() {
    java.util.Date date = new java.util.Date();
    java.lang.String modifiedDate = ((java.lang.String) (new java.text.SimpleDateFormat("yyyy/MM/dd").format(date)));
    java.lang.System.out.println(modifiedDate);
    return modifiedDate;
}