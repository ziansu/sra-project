@java.lang.Override
public int indexOf(T element) {
    boolean found = false;
    int index = 0;
    DLLNode<T> current = head;
    while ((!found) && (index < (size))) {
        if (current.getElement().equals(element)) {
            found = true;
        }else {
            current = current.getNext();
            index++;
        }
    } 
    if (!found) {
        index = -1;
    }
    return index;
}