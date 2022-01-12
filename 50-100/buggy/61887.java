@java.lang.Override
public java.lang.Object contains(java.lang.Object value) {
    ListElement<T> nextListElement = head.getNext();
    while (((nextListElement.getNext()) != null) && (!(nextListElement.getValue().equals(value)))) {
        nextListElement = nextListElement.getNext();
    } 
    return (nextListElement.getNext()) == null ? null : nextListElement.getValue();
}