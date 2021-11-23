public IntLinkedNode getNode(int position) {
    IntLinkedNode result = this.head;
    for (int i = 0; i < position; i++) {
        try {
            result = result.getNext();
        } catch (java.lang.NullPointerException e) {
            throw e;
        }
        return result;
    }
}