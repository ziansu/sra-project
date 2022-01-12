@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if (obj == null)
        return false;
    
    if ((this) == obj)
        return true;
    
    if (!(getClass().equals(obj.getClass())))
        return false;
    
    final de.xftl.spec.model.Point<?> other = ((de.xftl.spec.model.Point<?>) (obj));
    return (_x.equals(other._x)) && (_y.equals(other._y));
}