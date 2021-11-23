public static long toIntValue(java.lang.Object value) {
    int result;
    if (value instanceof java.lang.Number) {
        result = ((java.lang.Number) (value)).intValue();
    }else
        if (value instanceof de.codesourcery.javr.assembler.Address) {
            result = ((de.codesourcery.javr.assembler.Address) (value)).getByteAddress();
        }else {
            return de.codesourcery.javr.assembler.arch.AbstractAchitecture.VALUE_UNAVAILABLE;
        }
    
    return result;
}