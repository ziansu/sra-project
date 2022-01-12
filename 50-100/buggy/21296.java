@java.lang.Override
public boolean retainAll(final io.usethesource.capsule.api.Set<? extends K> set) {
    boolean modified = false;
    java.util.Iterator<K> thisIterator = iterator();
    while (thisIterator.hasNext()) {
        if (!(set.contains(thisIterator.next()))) {
            thisIterator.remove();
            modified = true;
        }
    } 
    return modified;
}