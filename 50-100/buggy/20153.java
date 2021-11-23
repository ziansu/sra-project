@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof org.apache.ignite.binary.BinaryBasicIdMapper))
        return false;
    
    org.apache.ignite.binary.BinaryBasicIdMapper mapper = ((org.apache.ignite.binary.BinaryBasicIdMapper) (o));
    if ((isLowerCase) != (mapper.isLowerCase))
        return false;
    
    return true;
}