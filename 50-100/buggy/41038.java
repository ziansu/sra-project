private void convertNode(groovy.util.Node node, com.thoughtworks.xstream.io.HierarchicalStreamWriter writer) {
    writer.startNode(node.name().toString());
    if ((node.value()) instanceof groovy.util.NodeList) {
        for (java.lang.Object subNode : ((groovy.util.NodeList) (node.value()))) {
            convertNode(((groovy.util.Node) (subNode)), writer);
        }
    }else {
        writer.setValue(node.value().toString());
    }
    writer.endNode();
}