public java.lang.String set(int i, java.lang.String x) {
    DLLNode temp = head;
    while (i > 0) {
        temp = temp.getNext();
        i--;
    } 
    return temp.setVal(x);
}