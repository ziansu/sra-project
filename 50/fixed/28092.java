@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public boolean isBodyAssignableTo(java.lang.Class c) {
    if ((text) == null)
        return true;
    
    return c.isAssignableFrom(java.lang.String.class);
}