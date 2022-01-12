public void add(java.lang.String data, int index) {
    testrepo.basiclinklist.Node tmp = new testrepo.basiclinklist.Node(data);
    testrepo.basiclinklist.Node current = head;
    for (int i = 1; (i < index) && ((current.getNext()) != null); i++) {
        current = current.getNext();
    }
    tmp.setNext(current.getNext());
    current.setNext(tmp);
    (listcount)++;
}