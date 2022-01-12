@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Class<?>> getTypes() {
    java.util.Map<java.lang.String, java.lang.Class<?>> ret = new java.util.HashMap<>();
    for (java.lang.String string : attributes.keySet())
        if ((attributes.get(string)) == null)
            ret.put(string, null);
        else
            ret.put(string, attributes.get(string).getClass());
        
    
    return null;
}