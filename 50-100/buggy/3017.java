@java.lang.Override
public java.lang.Iterable<K> keys() {
    java.util.List<K> aux = new java.util.ArrayList<>();
    for (int i = 0; i < (keys.length); i++) {
        aux.add(keys[i]);
    }
    return aux;
}