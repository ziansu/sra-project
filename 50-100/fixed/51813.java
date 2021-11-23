@java.lang.Override
public java.lang.Object convert(java.lang.Object fromObject) {
    java.lang.String value = ((java.lang.String) (fromObject));
    value = value.trim();
    try {
        long result = 0;
        for (java.lang.String part : value.split("\\+"))
            result += convertToLong(part.trim());
        
        return java.lang.Long.valueOf(result);
    } catch (java.text.ParseException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}