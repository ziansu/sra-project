@java.lang.Override
public void copyProperty(java.lang.Object dest, java.lang.String name, java.lang.Object value) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
    if (value == null)
        return ;
    
    if (name.equals("id"))
        return ;
    
    super.copyProperty(dest, name, value);
}