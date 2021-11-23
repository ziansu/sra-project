public java.lang.String getAsString() {
    if (isEmpty())
        return null;
    
    if ((value) instanceof java.lang.String) {
        return ((java.lang.String) (value));
    }
    throw new com.cybozu.kintone.database.exception.TypeMismatchException();
}