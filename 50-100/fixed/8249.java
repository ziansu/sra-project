void findBackward(java.lang.String pattern) {
    LineEditor.ElementDPtr temp = head;
    while (((temp.getValue()) != pattern) || (temp != (current))) {
        temp = temp.getNext();
    } 
    if ((temp.getValue()) == pattern) {
        current = temp;
    }else {
        java.lang.System.out.println((("STRING " + pattern) + " NOT FOUND."));
    }
}