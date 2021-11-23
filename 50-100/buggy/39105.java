public boolean find(java.lang.String value) {
    if ((head) == null) {
        return false;
    }else {
        org.javaproject.implement.MyDoubleNode p = new org.javaproject.implement.MyDoubleNode();
        p = head;
        while (p != null) {
            if (p.value.equals(value)) {
                return true;
            }else {
                p = ((org.javaproject.implement.MyDoubleNode) (p.next));
            }
        } 
        return false;
    }
}