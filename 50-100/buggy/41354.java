public java.lang.Object get(int idx) {
    int indexmanager = 0;
    if ((indexmanager > (this.nodeCount)) || (indexmanager < 0)) {
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