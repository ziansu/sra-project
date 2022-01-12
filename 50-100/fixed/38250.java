@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> c) {
    boolean hasChanged = false;
    com.hopkins.collections.Iterator<?> iter = c.iterator();
    while (iter.hasNext()) {
        if (remove(iter.next())) {
            hasChanged = true;
        }
    } 
    return hasChanged;
}