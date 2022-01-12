@java.lang.Override
public boolean equals(final java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((null == o) || ((getClass()) != (o.getClass())))
        return false;
    
    final lab.dynafig.Default.Value that = ((lab.dynafig.Default.Value) (o));
    return java.util.Objects.equals(value, that.value);
}