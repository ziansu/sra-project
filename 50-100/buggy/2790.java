@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    be.wegenenverkeer.atomium.japi.format.Content content = ((be.wegenenverkeer.atomium.japi.format.Content) (o));
    return (java.util.Objects.equals(type, content.type)) && (java.util.Objects.equals(value, content.value));
}