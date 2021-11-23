@java.lang.Override
protected void addNodeContent(final int nodeId, final org.dmg.pmml.NodeDocument.Node pmmlNode, final org.knime.base.node.mine.treeensemble2.model.TreeNodeRegression node) {
    addExtension(pmmlNode, node);
    double score = node.getMean();
    if ((node.getNrChildren()) == 0) {
        org.knime.core.node.util.CheckUtils.checkArgument(m_coefficientMap.containsKey(node.getSignature()), "The GBT model contains no coefficient for the leaf %s.", node);
        score = m_coefficientMap.get(node.getSignature());
    }
    pmmlNode.setScore(java.lang.Double.toString(score));
}