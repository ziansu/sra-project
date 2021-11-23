@java.lang.Override
protected void showInCanvas(com.net2plan.gui.plugins.networkDesign.ElementSelection selection) {
    if (getVisibleElementsInTable().isEmpty())
        return ;
    
    if ((selection.getElementType()) != (com.net2plan.internal.Constants.NetworkElementType.NODE))
        throw new java.lang.RuntimeException(("Unmatched selected items with table, selected items are of type: " + (selection.getElementType())));
    
    callback.getVisualizationState().pickElement(((java.util.List<com.net2plan.interfaces.networkDesign.Node>) (selection.getNetworkElements())));
    callback.updateVisualizationAfterPick();
}