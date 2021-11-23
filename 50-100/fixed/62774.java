@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> items) {
    boolean hasChanged = false;
    com.hopkins.collections.Iterator<?> iter = items.iterator();
    while (iter.hasNext()) {
        if (remove(iter.next())) {
            hasChanged = true;
        }
    } 
    return hasChanged;
}