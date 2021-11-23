@java.lang.Override
public void remove(java.io.File key, java.io.File val) {
    java.util.Set<java.io.File> vals = new java.util.HashSet<>(get(key));
    vals.remove(val);
    set(key, vals);
}