public linkedList.Node nodeAt(int idx) {
    int indexmanager = 0;
    if ((idx > (this.nodeCount)) || (idx < 0)) {
        return null;
    }else {
        for (linkedList.Node n = head; n != null; n = n.next) {
            if (indexmanager == idx) {
                return n;
            }else {
                indexmanager++;
            }
        }
        return null;
    }
}