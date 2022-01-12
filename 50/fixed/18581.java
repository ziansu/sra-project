public void setIdProperty(com.yahoo.squidb.sql.Property.LongProperty idProperty) {
    if ((this.idProperty) != null) {
        throw new java.lang.UnsupportedOperationException("Can't call setIdProperty on a Table more than once");
    }
    this.idProperty = idProperty;
}