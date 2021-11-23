private java.lang.String getISOCreationDate(long creationDate) {
    java.lang.StringBuilder creationDateValue = new java.lang.StringBuilder(org.apache.catalina.servlets.WebdavServlet.creationDateFormat.format(new java.util.Date(creationDate)));
    return creationDateValue.toString();
}