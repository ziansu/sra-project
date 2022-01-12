@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    policies.implementations.shortestpath.ShortestPathAttribute that = ((policies.implementations.shortestpath.ShortestPathAttribute) (o));
    return (length) != null ? length.equals(that.length) : (that.length) == null;
}