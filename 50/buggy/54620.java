public float ren(node.Node<node.StringNodeData> n1, node.Node<node.StringNodeData> n2) {
    return (n1.getNodeData().getLabel()) == (n2.getNodeData().getLabel()) ? 0.0F : 1.0F;
}