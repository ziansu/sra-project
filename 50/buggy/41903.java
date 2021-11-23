@java.lang.Override
public boolean addAll(java.util.Collection<? extends T> c) {
    boolean modified = false;
    for (java.lang.Object elem : c) {
        modified = modified || (add(((T) (elem))));
    }
    return modified;
}