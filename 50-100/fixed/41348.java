@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    net.jqwik.newArbitraries.NShrinkResult<?> that = ((net.jqwik.newArbitraries.NShrinkResult<?>) (o));
    return java.util.Objects.equals(shrunkValue, that.shrunkValue);
}