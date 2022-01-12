@java.lang.Override
public java.lang.Object remove(int index) {
    if ((index > (size)) || (index < 0))
        throw new java.lang.IndexOutOfBoundsException();
    
    E removedValue = null;
    if (index <= (size)) {
        removedValue = elements[index];
        for (int i = index; i < ((size) - 1); i++) {
            elements[i] = elements[(i + 1)];
        }
    }
    return removedValue;
}