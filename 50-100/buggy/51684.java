@java.lang.Override
public void selectNode(de.hshannover.f4.trust.visitmeta.interfaces.Propable propable) {
    de.hshannover.f4.trust.visitmeta.graphDrawer.Piccolo2DPanel.LOGGER.trace((("Method selectNode(" + propable) + ") called."));
    if ((propable != null) && ((mSelectedNode) != propable)) {
        de.hshannover.f4.trust.visitmeta.interfaces.Propable unselectedNode = mSelectedNode;
        mSelectedNode = propable;
        triggerRepaint(propable);
        triggerRepaint(unselectedNode);
    }
}