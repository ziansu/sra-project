@java.lang.Override
public boolean addAll(com.hopkins.collections.Collection<? extends T> c) {
    boolean isChanged = false;
    com.hopkins.collections.Iterator<? extends T> iter = c.iterator();
    while (iter.hasNext()) {
        isChanged |= add(iter.next());
    } 
    return isChanged;
}