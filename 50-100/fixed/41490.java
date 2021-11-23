@java.lang.Override
public java.lang.Object set(int index, java.lang.Object element) {
    if ((index > (size)) || (index < 0))
        throw new java.lang.IndexOutOfBoundsException();
    
    E oldValue = null;
    if (index <= (size)) {
        oldValue = elements[index];
        elements[index] = ((E) (element));
    }
    return oldValue;
}