@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> items) {
    boolean hasChanged = false;
    com.hopkins.collections.Iterator<?> iter = items.iterator();
    while (iter.hasNext()) {
        hasChanged = hasChanged || (remove(iter.next()));
    } 
    return hasChanged;
}