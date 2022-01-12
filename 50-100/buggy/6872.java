public boolean insert(int newData) {
    Node newestNode = new Node();
    s = $missing$;
    if (newestNode == null) {
        java.lang.System.out.println("Out of memory error.");
        return false;
    }else {
        newestNode.setData(newData);
        newestNode.setNext(head.getNext());
        head.setNext(newestNode);
        return true;
    }
}