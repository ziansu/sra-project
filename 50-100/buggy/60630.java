public org.sql2o.Query addParameter(java.lang.String name, java.util.Date value) {
    if ((this.connection.getSql2o().quirksMode) == (QuirksMode.DB2)) {
        return addParameter(name, ((java.lang.Object) (value)));
    }else {
        java.sql.Date sqlDate = (value == null) ? null : new java.sql.Date(value.getTime());
        return addParameter(name, sqlDate);
    }
}