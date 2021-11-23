@java.lang.Override
public java.lang.Object getValue(java.lang.Object obj) {
    java.lang.Object value = super.getValue(obj);
    java.lang.System.out.println(("----------------------------------------->" + value));
    if (value == null)
        return getDefaultValue(obj);
    
    return value;
}