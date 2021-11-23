private de.felix_klauke.babylon.node.NodeContainer readContainer(java.lang.String ident) throws java.io.IOException {
    check(de.felix_klauke.babylon.parser.ConfigParser.BEGIN_NODE);
    java.util.Map<java.lang.String, de.felix_klauke.babylon.node.Node> output = new java.util.HashMap<>();
    while ((current) != (de.felix_klauke.babylon.parser.ConfigParser.END_NODE)) {
        java.lang.String name = parseValIdent();
        this.check(de.felix_klauke.babylon.parser.ConfigParser.NODE_DELIMITER);
        de.felix_klauke.babylon.node.Node node = readNode(name);
        output.put(name, node);
    } 
    check(de.felix_klauke.babylon.parser.ConfigParser.END_NODE);
    return new de.felix_klauke.babylon.node.NodeContainer(ident, output);
}