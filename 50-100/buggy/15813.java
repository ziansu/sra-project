public static void main(java.lang.String[] args) {
    SingleLinkedList list = new SingleLinkedList();
    list.addData(1);
    list.addData(2);
    list.addData(3);
    list.addData(2);
    list.addData(2);
    list.addData(6);
    list.deleteAll(2);
    list.printList();
}