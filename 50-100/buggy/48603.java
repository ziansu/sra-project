@java.lang.Override
public void set(T value) {
    if ((value != null) && (!(tClazz.isAssignableFrom(value.getClass())))) {
        throw new java.lang.IllegalArgumentException(("value is not assignable " + value));
    }
    V temp = ((V) (value));
    map.put(key, temp);
    super.setValue(value);
}