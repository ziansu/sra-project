public void addToSubProcessNodes(org.openflexo.foundation.wkf.node.SubProcessNode node) {
    if (org.openflexo.foundation.wkf.FlexoProcess.logger.isLoggable(java.util.logging.Level.FINE)) {
        org.openflexo.foundation.wkf.FlexoProcess.logger.fine((((getName()) + ": addToSubProcessNodes() ") + (node.getName())));
    }
    if ((!(node.getXMLResourceData().getFlexoXMLFileResource().isConverting())) && (!(_subProcessNodes.contains(node)))) {
        _subProcessNodes.add(node);
        addObserver(node);
    }
}