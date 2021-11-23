@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> c) {
    boolean hasChanged = false;
    com.hopkins.collections.Iterator<?> iter = c.iterator();
    while (iter.hasNext()) {
        hasChanged = hasChanged || (remove(iter.next()));
    } 
    return hasChanged;
}