@java.lang.Override
public boolean removeAll(com.hopkins.collections.Collection<?> c) {
    boolean isChanged = false;
    com.hopkins.collections.Iterator<?> iter = c.iterator();
    while (iter.hasNext()) {
        isChanged |= remove(iter.next());
    } 
    return isChanged;
}