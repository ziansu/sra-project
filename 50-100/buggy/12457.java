@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    java.lang.Number that = ((java.lang.Number) (o));
    return ((compareTo(that)) == 0) || (value.equals(that.doubleValue()));
}