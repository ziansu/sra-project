private java.lang.String getISOCreationDate(long creationDate) {
    return org.apache.catalina.servlets.WebdavServlet.creationDateFormat.format(new java.util.Date(creationDate));
}