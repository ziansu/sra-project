private java.lang.String getSqlMessage(java.sql.SQLException e) {
    java.lang.StringBuilder sbf = new java.lang.StringBuilder();
    for (java.lang.Throwable t : e) {
        sbf.append(t.getMessage()).append('\n');
        org.simplity.kernel.ApplicationError.logger.error(e.getMessage());
    }
    return sbf.toString();
}