@java.lang.Override
public void add(int index, java.lang.Object element) {
    if (index > (size))
        return ;
    
    if ((size) == (elements.length))
        doubleArraySize();
    
    elements[index] = ((E) (element));
}