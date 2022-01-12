public void add(int data) {
    testrepo.basiclinklist.Node tmp = new testrepo.basiclinklist.Node(data);
    testrepo.basiclinklist.Node current = head;
    while ((current.getNext()) != null) {
        current = current.getNext();
    } 
    current.setNext(tmp);
    (listcount)++;
}