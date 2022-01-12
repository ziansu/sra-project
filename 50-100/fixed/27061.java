@java.lang.Override
public java.lang.Integer getIndex(T value) {
    int count = List.LIST_BEGIN;
    de.phip1611.linked_lists.BidirectionalListElement currentListElement = this.listBegin;
    while (currentListElement != null) {
        if (currentListElement.getValue().equals(value)) {
            return count;
        }
        currentListElement = currentListElement.getNext();
        count++;
    } 
    return null;
}