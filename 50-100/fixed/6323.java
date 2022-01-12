public void add(java.lang.String data) {
    testrepo.basiclinklist.Node tmp = new testrepo.basiclinklist.Node(data);
    if ((head.getData()) == null) {
        head = tmp;
    }else {
        testrepo.basiclinklist.Node current = head;
        while ((current.getNext()) != null) {
            current = current.getNext();
        } 
        current.setNext(tmp);
        (listcount)++;
    }
}