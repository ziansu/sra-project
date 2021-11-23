public java.lang.String getName() throws java.sql.SQLException, javax.naming.NamingException, org.igfay.jfig.JFigException {
    logger.debug("Inside getName()");
    return getPingBean().retrieveName();
}