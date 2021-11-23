private adaptiveHuffman.tree.Node findHighestIndexWeight(adaptiveHuffman.tree.Node node) {
    adaptiveHuffman.tree.Node next;
    int index = (node.getIndex()) + 1;
    int weight = node.getWeight();
    while (((next = order.get(index)).getWeight()) == weight) {
        index++;
    } 
    next = order.get((--index));
    return next;
}