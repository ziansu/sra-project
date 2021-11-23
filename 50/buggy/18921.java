public boolean search(int d) {
    implementation.LinkedList.Node n = search(head, d);
    return (n.data) == d;
}