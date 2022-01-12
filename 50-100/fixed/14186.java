public java.lang.Object set(int idx, java.lang.Object elem) {
    int indexmanager = 0;
    if ((idx > (this.nodeCount)) || (idx < 0)) {
        return null;
    }else {
        for (Node n = head; n != null; n = n.next) {
            if (indexmanager == idx) {
                java.lang.Object temp = n.element;
                n.element = elem;
                return temp;
            }else {
                indexmanager++;
            }
        }
        return null;
    }
}