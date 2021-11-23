@java.lang.SuppressWarnings(value = "unchecked")
public E next() {
    if (!(hasNext())) {
        throw new java.util.NoSuchElementException();
    }
    E next = ((E) (arr[pos]));
    if (!(hasNext())) {
        (obsList.msgCount)--;
    }
    return next;
}