@java.lang.Override
public boolean addAll(int index, java.util.Collection<? extends E> c) {
    if (index == (size()))
        return addAll(c);
    
    N node = getNodeAt(index);
    boolean first = true;
    for (E o : c) {
        if (first) {
            node = addBefore(o, node);
            first = false;
        }else
            node = addAfter(o, node);
        
    }
    return !(c.isEmpty());
}