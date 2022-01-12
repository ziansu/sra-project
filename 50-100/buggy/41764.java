private void collectMetdataForExports(com.google.javascript.rhino.Node namedNode, com.google.javascript.rhino.Node parent, java.lang.String fileName) {
    if (!(fileToModule.containsKey(fileName))) {
        return ;
    }
    java.lang.String nodeName = com.google.common.base.Preconditions.checkNotNull(namedNode.getFirstChild().getQualifiedName());
    exportsToNodes.put(com.google.javascript.gents.ModuleConversionPass.ExportedSymbol.of(fileName, nodeName, nodeName), namedNode);
}