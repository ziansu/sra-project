@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public E remove(int index) {
    if ((index >= (size)) || (index < 0)) {
        throw new java.lang.IndexOutOfBoundsException("Argument 'index' is out of bounds");
    }
    E removedElement = ((E) (elements[index]));
    for (int j = index; j < ((size) - 1); j++) {
        elements[j] = elements[(j + 1)];
    }
    (size)--;
    return removedElement;
}