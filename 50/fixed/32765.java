@java.lang.SuppressWarnings(value = "unchecked")
public E get(int index) {
    if ((index < 0) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return ((E) (list[index]));
}