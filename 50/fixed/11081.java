@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T get(int index) {
    if ((index < 0) || (index >= (size))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return ((T) (dataArray[index]));
}