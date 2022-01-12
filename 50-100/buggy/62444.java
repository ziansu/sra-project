@java.lang.Override
public T next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    T temp = array[index];
    (index)++;
    while ((hasNext()) && ((array[index]) == null)) {
        (index)++;
    } 
    return temp;
}