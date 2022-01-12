public boolean select(org.fosstrak.llrp.commander.views.Viewer aViewer, java.lang.Object aParentElement, java.lang.Object aElement) {
    if (aElement instanceof org.fosstrak.llrp.client.LLRPMessageItem) {
        org.fosstrak.llrp.client.LLRPMessageItem item = ((org.fosstrak.llrp.client.LLRPMessageItem) (aElement));
        if (item.getMessageType().equals("RO_ACCESS_REPORT")) {
            return false;
        }
    }
    return true;
}