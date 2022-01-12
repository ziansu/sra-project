public java.lang.String put(java.lang.String key, java.lang.String value) {
    if ((size) == ((capacity) * (averageListCapacity))) {
        resize();
    }
    ru.spbau.mit.java.fall2017.containers.LinkedList l = table[indexByKey(key)];
    java.lang.String oldValue = table[indexByKey(key)].add(key, value);
    if (oldValue != null) {
        return oldValue;
    }else {
        ++(size);
        return null;
    }
}