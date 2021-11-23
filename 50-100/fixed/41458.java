public void setValue(java.lang.String value) {
    if (value == null)
        throw new org.apache.commons.lang.NullArgumentException("value cannot be null");
    
    reset();
    content.append(value);
    if (((value.length()) != 0) && ((value.charAt(((value.length()) - 1))) != (separator)))
        content.append(separator);
    
}