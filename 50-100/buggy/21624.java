public void addFront(int data) {
    if ((head) == null)
        head = new doublelinkedlist.Link(data);
    else {
        doublelinkedlist.Link newLink = new doublelinkedlist.Link(null, data, head);
        head.previous = newLink;
        head = newLink;
        (size)++;
    }
}