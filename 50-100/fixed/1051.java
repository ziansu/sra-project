public boolean select(org.fosstrak.llrp.commander.views.Viewer aViewer, java.lang.Object aParentElement, java.lang.Object aElement) {
    if (aElement instanceof org.fosstrak.llrp.client.LLRPMessageItem) {
        org.fosstrak.llrp.client.LLRPMessageItem item = ((org.fosstrak.llrp.client.LLRPMessageItem) (aElement));
        java.lang.String msg = item.getMessageType();
        if (null == msg) {
            return true;
        }
        if ("RO_ACCESS_REPORT".equals(msg.trim())) {
            return false;
        }
    }
    return true;
}