@java.lang.Override
public T getValue(int index) {
    if (de.phip1611.linked_lists.SimpleList.indexInRange(index)) {
        de.phip1611.linked_lists.LinearListElement<T> listElement = this.listBegin;
        java.lang.Integer count = LIST_BEGIN;
        while (listElement != null) {
            if (count.equals(index)) {
                return listElement.getValue();
            }else {
                listElement = listElement.getNext();
                count++;
            }
        } 
    }
    return null;
}