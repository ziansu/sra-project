@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.apache.brooklyn.util.guava.Maybe))
        return false;
    
    org.apache.brooklyn.util.guava.Maybe<?> other = ((org.apache.brooklyn.util.guava.Maybe<?>) (obj));
    if (!(isPresent()))
        return !(other.isPresent());
    
    if (!(other.isPresent()))
        return false;
    
    return com.google.common.base.Objects.equal(get(), other.get());
}