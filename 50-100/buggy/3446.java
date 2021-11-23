public static Node genHuffman(java.util.PriorityQueue<Node> sortedList) {
    while ((sortedList.size()) > 2) {
        sortedList.add(new Node(sortedList.poll(), sortedList.poll()));
    } 
    return new Node(sortedList.poll(), sortedList.poll());
}