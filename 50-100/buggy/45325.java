@java.lang.Override
public org.AD_P1.Interfaces.HAWListElement<E> retrieve(java.lang.Object pos) {
    org.AD_P1.DoublyLinkedList.HAWLinkedArrayList.count();
    if (pos == null) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    org.AD_P1.DoublyLinkedList.LinkedArrayElement<E> arrayElement = ((org.AD_P1.DoublyLinkedList.LinkedArrayElement<E>) (pos));
    return arrayElement.getElementWrapper();
}