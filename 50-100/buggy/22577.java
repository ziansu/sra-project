public java.lang.String getFieldName(int i) throws java.util.NoSuchElementException {
    if ((i < 0) || (i >= (TDarray.size()))) {
        throw new java.util.NoSuchElementException();
    }else
        return TDarray.get(i).fieldName;
    
}