public void printBackward() {
    cpe200.week2.PNode tmp = tail;
    while (tmp != null) {
        java.lang.System.out.print(tmp.data);
        tmp = tmp.prev;
    } 
    java.lang.System.out.println("");
}