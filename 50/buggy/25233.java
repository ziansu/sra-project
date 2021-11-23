protected java.lang.String processNamingException(javax.naming.NamingException nme) {
    com.identity4j.connector.jndi.directory.DirectoryExceptionParser dep = new com.identity4j.connector.jndi.directory.DirectoryExceptionParser(nme);
    java.lang.String message = dep.getMessage();
    com.identity4j.connector.jndi.directory.DirectoryConnector.LOG.error(("Connected OK, but an error occurred retrieving information from the directory server (operationsErrror). " + message), nme);
    throw new com.identity4j.connector.exception.ConnectorException(message, nme);
}