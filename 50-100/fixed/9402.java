private com.graphhopper.routing.util.FlagEncoder getEncoder(java.lang.String name, boolean throwExc) {
    for (com.graphhopper.routing.util.FlagEncoder encoder : edgeEncoders) {
        if (name.equalsIgnoreCase(encoder.toString()))
            return encoder;
        
    }
    if (throwExc)
        throw new java.lang.IllegalArgumentException(((("Encoder for " + name) + " not found. Existing: ") + (toDetailsString())));
    
    return null;
}