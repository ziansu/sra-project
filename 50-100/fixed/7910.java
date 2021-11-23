private se.plilja.imcollect.WeightBalancedTree<K>.Node<K> doubleLeft(se.plilja.imcollect.WeightBalancedTree<K>.Node<K> node) {
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> L = node.left;
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> R = node.right;
    se.plilja.imcollect.WeightBalancedTree<K>.Node<K> RL = R.left;
    return node(RL.key, node(node.key, L, RL.left), node(R.key, RL.right, R.right));
}