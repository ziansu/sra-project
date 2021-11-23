@java.lang.Override
public void remove(java.io.File key, java.io.File val) {
    java.util.Collection<java.io.File> vals = get(key);
    vals.remove(val);
    set(key, vals);
}