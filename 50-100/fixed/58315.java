private void setField(com.mozzandroidutils.sqlite.Model t, java.lang.String fieldName, java.lang.Object value) throws java.lang.IllegalArgumentException {
    if (value == null)
        return ;
    
    if (((value instanceof java.lang.Number) || (value instanceof java.lang.String)) || (value instanceof byte[]))
        t.set(fieldName, value);
    else
        throw new java.lang.IllegalArgumentException("value must be instance of Number, String, or byte[]");
    
}