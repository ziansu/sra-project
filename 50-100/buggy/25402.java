private void updateTree(adaptiveHuffman.tree.Node node) {
    while (node != (root)) {
        if (maxInWeightClass(node)) {
            adaptiveHuffman.tree.Node toSwap = findHighestIndexWeight(node);
            swap(toSwap, node);
            node.increment();
            node = node.parent;
        }
    } 
    node.increment();
    node.setIndex(order.indexOf(node));
}