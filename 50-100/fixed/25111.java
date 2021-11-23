@java.lang.Override
public boolean addAll(int index, java.util.Collection<? extends T> c) {
    if (c == null)
        throw new java.lang.NullPointerException("Passed Collection is intolerably null.");
    
    if (index < 0)
        throw new java.lang.IllegalArgumentException("Passed index is intolerably negative.");
    
    getSubList().addAll(index, c);
    adjustSize(c.size());
    return false;
}