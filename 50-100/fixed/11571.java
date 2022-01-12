private java.lang.String getFinalValue(java.lang.String newVal, java.lang.String oldVal) {
    if (newVal == null)
        return null;
    
    if (oldVal == null)
        return newVal;
    
    if (newVal.equals(oldVal)) {
        return null;
    }else {
        return newVal;
    }
}