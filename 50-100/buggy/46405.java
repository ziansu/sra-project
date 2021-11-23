@java.lang.Override
public V remove(K key) {
    V value = null;
    for (int i = 0; i < (size); i++) {
        if (values[i].getKey().equals(key)) {
            value = values[i].getValue();
            values[i] = null;
            (size)--;
            condenseArray(i);
        }
    }
    return value;
}