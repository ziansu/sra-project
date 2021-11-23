private com.topaz.controller.ControllerNode findControllerNode(com.topaz.controller.ModuleNode node, int pos, java.lang.String[] pNames) {
    if (pos >= (pNames.length))
        return null;
    
    java.lang.String pName = pNames[pos];
    if (node.hasController(pName)) {
        return node.findControllerNode(pName);
    }
    if (node.hasNode(pName)) {
        return findControllerNode(node.findNode(pName), (++pos), pNames);
    }
    return null;
}