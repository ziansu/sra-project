@java.lang.Override
public int getMappedOrdinal(java.lang.String type, int originalOrdinal) {
    int[] typeMapping = typeMappings.get(type);
    if (typeMapping == null)
        return originalOrdinal;
    
    if ((typeMapping[originalOrdinal]) == (-1))
        typeMapping[originalOrdinal] = combiner.copyOrdinal(type, originalOrdinal);
    
    return typeMapping[originalOrdinal];
}