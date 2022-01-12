public void printList() {
    IntNode pointer = this;
    java.lang.System.out.println("The numbers in the array are: ");
    while (true) {
        java.lang.System.out.println(pointer.getInt());
        pointer = pointer.getNext();
        if ((pointer.getNext()) == null) {
            java.lang.System.out.println(pointer.getInt());
            break;
        }
    } 
}