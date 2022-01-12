@java.lang.Override
public void add(int index, java.lang.Object element) {
    if ((index < 0) || (index > ((size) - 1)))
        return ;
    
    if ((size) == (elements.length))
        doubleArraySize();
    
    elements[index] = ((E) (element));
}