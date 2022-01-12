public void setValue(java.lang.String value) {
    if (value == null)
        throw new org.apache.commons.lang.NullArgumentException("value cannot be null");
    
    if (value.isEmpty())
        throw new org.apache.commons.lang.NullArgumentException("value cannot be empty");
    
    reset();
    content.append(value);
    if ((value.charAt(((value.length()) - 1))) != (separator))
        content.append(separator);
    
}