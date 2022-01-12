private void triggerRepaint(de.hshannover.f4.trust.visitmeta.interfaces.Propable propable) {
    de.hshannover.f4.trust.visitmeta.graphDrawer.Piccolo2DPanel.LOGGER.trace((("Method triggerRepaint(" + propable) + ") called."));
    if (propable instanceof de.hshannover.f4.trust.visitmeta.interfaces.Identifier) {
        repaintNodes(NodeType.IDENTIFIER, "");
    }else
        if (propable instanceof de.hshannover.f4.trust.visitmeta.interfaces.Metadata) {
            repaintNodes(NodeType.METADATA, extractPublisherId(((de.hshannover.f4.trust.visitmeta.interfaces.Metadata) (propable))));
        }
    
}