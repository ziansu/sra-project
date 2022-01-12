public void printDeque() {
    if ((sentinel.next) == null) {
        java.lang.System.out.println("Empty List!");
    }else {
        printThis = sentinel;
        while ((printThis.next) != (sentinel)) {
            java.lang.System.out.println(("Item: " + (sentinel.item)));
            printThis = printThis.next;
        } 
    }
}