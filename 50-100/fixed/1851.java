@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T from(java.lang.CharSequence in) {
    org.apache.felix.serializer.impl.json.JsonParser jp = new org.apache.felix.serializer.impl.json.JsonParser(in);
    java.util.Map<?, ?> m = jp.getParsed();
    if ((clazz) instanceof java.lang.Class)
        if (m.getClass().isAssignableFrom(((java.lang.Class<?>) (clazz))))
            return ((T) (m));
        
    
    return ((T) (converter.convert(m).to(clazz)));
}