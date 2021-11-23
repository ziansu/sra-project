public static void main(java.lang.String[] args) {
    LinkedList list = new LinkedList();
    for (int i = 0; i < 10; i++) {
        list.addLast(i);
    }
    list.printList();
    for (int i = -1; i < ((list.getSize()) + 1); i++) {
        java.lang.System.out.println(((i + " -> ") + (list.getKthToLast(i))));
    }
}