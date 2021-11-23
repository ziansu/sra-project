private T get(int index) {
    try {
        MyLinkedList<T>.LNode current = start;
        for (int i = 0; i < (size); i++) {
            if (i == index) {
                return current.getValue();
            }
            current = current.getNext();
        }
    } catch (java.lang.IndexOutOfBoundsException e) {
        java.lang.System.out.println("Index out of bound");
    }
}