@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == null)
        return false;
    
    if (!(o instanceof java.util.Map))
        return false;
    
    final java.util.Set<?> otherSet = ((java.util.Set<?>) (o));
    return (this.containsAll(otherSet)) && (otherSet.containsAll(this));
}