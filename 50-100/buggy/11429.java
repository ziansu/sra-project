public java.lang.String toString(com.google.code.or.common.glossary.Column column) {
    java.lang.String value = null;
    if (null != column) {
        if (column instanceof com.google.code.or.common.glossary.column.BlobColumn) {
            value = new java.lang.String(((com.google.code.or.common.glossary.column.BlobColumn) (column)).getValue());
        }else
            if ((column.getValue()) != null) {
                value = column.toString();
            }
        
    }
    return value;
}