public java.lang.String getUserSince() {
    java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat("MMMM d, yyyy");
    java.lang.String formatedDate = formater.format(userSince);
    return formatedDate;
}