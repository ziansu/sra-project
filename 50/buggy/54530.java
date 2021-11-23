@java.lang.Override
public void printDeque() {
    for (LinkedListDeque.Node ptr = front.next; ptr != (rear); ptr = ptr.next) {
        java.lang.System.out.println(((ptr.value) + " "));
    }
}