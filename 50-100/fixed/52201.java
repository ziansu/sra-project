@java.lang.Override
public int indexOf(T value) {
    int count = 0;
    ListElement<T> nextListElement = head.getNext();
    while (((nextListElement.getNext()) != null) && (!(nextListElement.getValue().equals(value)))) {
        nextListElement = nextListElement.getNext();
        count++;
    } 
    return (nextListElement.getNext()) == null ? -1 : count;
}