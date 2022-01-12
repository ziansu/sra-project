private se.plilja.imcollect.WeightBalancedTree<K>.Node<K> doubleRight(se.plilja.imcollect.WeightBalancedTree<K>.Node<K> node) {
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> L = node.left;
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> R = node.right;
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> LR = L.right;
    return node(LR.left.key, node(L.key, L.left, LR.left), node(node.key, LR.right, R));
}