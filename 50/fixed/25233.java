protected java.lang.String processNamingException(javax.naming.NamingException nme) {
    com.identity4j.connector.jndi.directory.DirectoryExceptionParser dep = new com.identity4j.connector.jndi.directory.DirectoryExceptionParser(nme);
    java.lang.String message = dep.getMessage();
    throw new com.identity4j.connector.exception.ConnectorException(message, nme);
}