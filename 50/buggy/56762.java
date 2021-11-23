@java.lang.SuppressWarnings(value = "unchecked")
public boolean equals(java.lang.Object otherFlow) {
    if (sameType(otherFlow)) {
        return bits.equals(((soot.toolkits.scalar.ArrayPackedSet<T>) (otherFlow)).bits);
    }else
        return super.equals(otherFlow);
    
}