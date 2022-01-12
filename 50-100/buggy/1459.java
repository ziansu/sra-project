private void processCascadingSelect(org.w3c.dom.Node n) {
    java.lang.String instanceId = null;
    org.w3c.dom.NamedNodeMap nmL = n.getAttributes();
    if (nmL != null) {
        org.w3c.dom.Node id = nmL.getNamedItem("id");
        if (id != null) {
            instanceId = id.getNodeValue();
            java.lang.System.out.println(("Cascading Instance ID:" + instanceId));
        }
    }
    if (instanceId != null) {
        org.w3c.dom.Node topInstance = org.smap.server.utilities.UtilityMethods.getFirstElement(n);
        processCascadingItems(topInstance, instanceId);
    }
}