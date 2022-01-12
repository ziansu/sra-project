@java.lang.Override
public java.lang.Integer getIndex(T value) {
    de.phip1611.linked_lists.LinearListElement<T> listElement = this.listBegin;
    java.lang.Integer count = LIST_BEGIN;
    while (listElement != null) {
        if (listElement.getValue().equals(value)) {
            return count;
        }
        count++;
        listElement = listElement.getNext();
    } 
    return 0;
}