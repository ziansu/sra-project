public java.lang.Object get(int idx) {
    int indexmanager = 0;
    if ((idx > (this.nodeCount)) || (idx < 0)) {
        return null;
    }else {
        for (Node n = head; n != null; n = n.next) {
            if (indexmanager == idx) {
                return n.element;
            }else {
                indexmanager++;
            }
        }
        return null;
    }
}