@java.lang.SuppressWarnings(value = "unchecked")
public <T> T resolve(java.lang.Class<T> c) {
    if (c == null) {
        throw new java.lang.NullPointerException("requested provider interface is null");
    }
    synchronized(type2instance) {
        T obj = ((T) (type2instance.get(c)));
        if (obj == null) {
            obj = loadProvider(c);
            type2instance.put(c, obj);
        }
        return obj;
    }
}