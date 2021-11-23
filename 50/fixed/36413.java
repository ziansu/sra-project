@java.lang.Override
public void delete(K key) {
    root = delete(key, root);
}