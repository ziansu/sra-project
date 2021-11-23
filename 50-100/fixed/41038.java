private void convertNode(groovy.util.Node node, com.thoughtworks.xstream.io.HierarchicalStreamWriter writer) {
    writer.startNode(node.name().toString());
    if ((node.value()) instanceof java.util.Collection) {
        for (java.lang.Object subNode : ((java.util.Collection) (node.value()))) {
            convertNode(((groovy.util.Node) (subNode)), writer);
        }
    }else {
        writer.setValue(node.value().toString());
    }
    writer.endNode();
}