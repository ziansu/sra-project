public java.lang.String format(java.lang.Object value) {
    if (value == null)
        return null;
    else
        if ((pattern) == null)
            return ((java.lang.Number) (value)).toString();
        else
            if ((format) != null)
                return format.get().format(value);
            else
                return createDecimalFormat().format(value);
            
        
    
}