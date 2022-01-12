private net.frapu.code.visualization.ProcessNode getNodeFor(java.util.Map<de.uni_potsdam.hpi.bpt.bp2014.conversion.INode, de.uni_potsdam.hpi.bpt.bp2014.conversion.olc.DataObjectState> processedNodes, de.uni_potsdam.hpi.bpt.bp2014.conversion.INode node) {
    if (!(processedNodes.containsKey(node))) {
        processedNodes.put(node, new de.uni_potsdam.hpi.bpt.bp2014.conversion.olc.DataObjectState());
    }
    de.uni_potsdam.hpi.bpt.bp2014.conversion.olc.DataObjectState newNode = processedNodes.get(node);
    newNode.setText(((de.uni_potsdam.hpi.bpt.bp2014.conversion.olc.DataObjectState) (node)).getName());
    markAsStartIfInit(newNode);
    return newNode;
}