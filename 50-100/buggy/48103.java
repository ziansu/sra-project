public long getAsBytes(org.apache.accumulo.core.conf.Property property) {
    checkType(property, PropertyType.BYTES);
    java.lang.String memString = get(property);
    if (property.getType().equals(PropertyType.MEMORY)) {
        return org.apache.accumulo.core.conf.AccumuloConfiguration.getMemoryAsBytes(memString);
    }else
        if (property.getType().equals(PropertyType.BYTES)) {
            return org.apache.accumulo.core.conf.AccumuloConfiguration.getFixedMemoryAsBytes(memString);
        }else {
            throw new java.lang.IllegalArgumentException(((property.getKey()) + " is not of BYTES or MEMORY type"));
        }
    
}