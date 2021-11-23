public long getAsBytes(org.apache.accumulo.core.conf.Property property) {
    java.lang.String memString = get(property);
    if ((property.getType()) == (PropertyType.MEMORY)) {
        return org.apache.accumulo.core.conf.AccumuloConfiguration.getMemoryAsBytes(memString);
    }else
        if ((property.getType()) == (PropertyType.BYTES)) {
            return org.apache.accumulo.core.conf.AccumuloConfiguration.getFixedMemoryAsBytes(memString);
        }else {
            throw new java.lang.IllegalArgumentException(((property.getKey()) + " is not of BYTES or MEMORY type"));
        }
    
}