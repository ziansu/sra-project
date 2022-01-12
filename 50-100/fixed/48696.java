@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    io.cloudslang.lang.entities.bindings.values.SensitiveValue that = ((io.cloudslang.lang.entities.bindings.values.SensitiveValue) (o));
    return (content) != null ? content.equals(that.content) : (that.content) == null;
}