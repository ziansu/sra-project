@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> c) {
    com.hopkins.collections.Iterator<?> iter = c.iterator();
    boolean isChanged = false;
    while (iter.hasNext()) {
        java.lang.Object item = iter.next();
        if (map.containsKey(item)) {
            map.remove(item);
            isChanged = true;
        }
    } 
    return isChanged;
}