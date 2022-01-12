@java.lang.Override
public java.lang.Object get(int index) {
    if ((index > (size)) || (index < 0))
        throw new java.lang.IndexOutOfBoundsException();
    
    if ((index < 0) || (index > ((size) - 1)))
        return null;
    
    return elements[index];
}