@java.lang.Override
public boolean canHandle(java.lang.Class object) {
    if (object == null)
        return false;
    
    return type.isAssignableFrom(object);
}