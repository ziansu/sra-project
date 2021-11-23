public void move() {
    Node next = getNextNode();
    if (!(travelled.contains(currNode))) {
        travelled.add(currNode);
    }
    if (!(map.getTotalset().contains(currNode))) {
        map.getTotalset().add(currNode);
    }
    prevNode = currNode;
    currNode = next;
}