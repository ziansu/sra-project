public org.sql2o.Query addParameter(java.lang.String name, java.util.Date value) {
    java.sql.Date sqlDate = (value == null) ? null : new java.sql.Date(value.getTime());
    if ((this.connection.getSql2o().quirksMode) == (QuirksMode.DB2)) {
        return addParameter(name, ((java.lang.Object) (sqlDate)));
    }else {
        return addParameter(name, sqlDate);
    }
}