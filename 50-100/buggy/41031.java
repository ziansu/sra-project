public java.lang.String get(int i) throws java.lang.ArrayIndexOutOfBoundsException {
    if ((i < 0) || (i > (length))) {
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }else {
        int counter = 0;
        org.javaproject.implement.MyDoubleNode p = new org.javaproject.implement.MyDoubleNode();
        p = head;
        while (p != null) {
            if (i != counter) {
                counter++;
                p = ((org.javaproject.implement.MyDoubleNode) (p.next));
            }else {
                break;
            }
        } 
        return p.value;
    }
}