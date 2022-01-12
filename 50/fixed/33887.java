public java.lang.String getCreationTime() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
    return sdf.format(new java.util.Date(time));
}