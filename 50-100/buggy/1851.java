@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T from(java.lang.CharSequence in) {
    org.apache.felix.serializer.impl.json.JsonParser jp = new org.apache.felix.serializer.impl.json.JsonParser(in);
    java.util.Map<?, ?> m = jp.getParsed();
    if (m.getClass().isAssignableFrom(clazz))
        return ((T) (m));
    
    return converter.convert(m).to(clazz);
}